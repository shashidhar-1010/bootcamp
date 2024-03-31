import express from 'express'
const app = express()
const mylogger = function(req,res,next){
    console.log('logged')
    next()
}

const myapp = function(req,res,next){
    console.log('using the app')
    next()
}

const mylogout = function(req,res,next){
    console.log('exit from the app')
    next()
}


app.use(mylogger)
app.use(myapp)
app.use(mylogout)

app.get('/',(req,res)=>{
    res.send('hello this is from middleware')
})

app.listen(5000)