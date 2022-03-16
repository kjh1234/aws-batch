const aws = require('aws-sdk');

exports.handler = (event, context, callback) => {
    const stepfunctions = new aws.StepFunctions();
    const params = {
        output: JSON.stringify(event.output),
        taskToken: event.token
    };
    
    console.log(`Calling Step Functions to complete callback task with params ${JSON.stringify(params)}`);
    
    stepfunctions.sendTaskSuccess(params, (err, data) => {
        if (err) {
            console.error(err.message);
            callback(err.message);
            return;
        }
        console.log(data);
        callback(null);
    });
};