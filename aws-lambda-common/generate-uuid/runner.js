/**
 * Local Run Test
 */
const main  = require('./index.js');

const callback = e => {
    console.log(e)
}
let handler = main.handler({}, {}, callback)

if(handler instanceof Promise) {
    handler.then(e => {
        console.log(e)
    })
}