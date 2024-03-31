//const http = require('http');
import http from 'http';
const server = http.createServer((req,res)=>{
    res.write("node web server")
    res.end("hello world")
    res.write("server still running")
})
//it will listen to perticular port
server.listen(5000);

console.log("server staretd successfully")