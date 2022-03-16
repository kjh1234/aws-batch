const aws = require('aws-sdk');

exports.handler = (event, context, callback) => {
    const stepfunctions = new aws.StepFunctions();
    const params = {
        cause: event.cause ? JSON.stringify(event.cause) : '',
        error: event.error ? JSON.stringify(event.error) : '',
        taskToken: event.token
    };
    
    console.log(`Calling Step Functions to complete callback task with params ${JSON.stringify(params)}`);
    
    stepfunctions.sendTaskFailure(params, (err, data) => {
        if (err) {
            console.error(err.message);
            callback(err.message);
            return;
        }
        console.log(data);
        callback(null);
    });
};