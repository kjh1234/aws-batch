exports.handler = async (event) => {
    const { v4:uuidv4 } = require('uuid');
    return {
        statusCode: 200, 
        body: {'uuid': uuidv4()}
    }
}