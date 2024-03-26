const express = require('express');
const app = express();
const port = 4000
app.get('/user/:name',(req,res)=>{
    const name = req.params.name
    res.send(`hello ${name}`)


})


// app.post('/user/salary',(req,res)=>{
//     var data = req.body;
//     res.send(data);
// })


app.listen(port,(req,res)=>{
    console.log(`server is running at ${port}`)
})