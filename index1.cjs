const express = require('express');
const app = express();
const path = require('path');
const port = 5000;

app.use(express.static(path.join(__dirname,'node')))
app.get('/',function(req,res,next){
    res.render('home.html');
})

app.listen(port,function(err){
    if(err) console.log(err);
    console.log("Server listening on port",port)
});

// import express from 'express';
// import path from 'path';
 
// // const express = require('express')
// const app = express()
// const PORT = 2344
 
// const __dirname = path.resolve()
 
// // Static Middleware
// app.use(express.static(path.resolve(__dirname, 'node')))
 
// app.get('/', (req, res, next) => {
//     res.render('home.html');
// })
 
// app.listen(PORT, (err) => {
//     if(err) {
//         console.log(err)
//     }
//     console.log("Server Running on port... ", PORT)
// })

app.post('/users-list',(eq,res)=>{
    const usersList = req.body;
    res.send({
        message :'new user was added',
    });
});