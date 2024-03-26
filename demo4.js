import express from 'express'
import mongoose from 'mongoose';
const app = express();

app.use(express.json())

mongoose.connect('mongodb://localhost:27017/user')
.then(()=>{
    console.log("connected successfully")
    console.log('existing')
    //client.close()
})
.catch(error => console.log("failed to connect ", error))

const studentSchema = new mongoose.Schema({
    name: String,
    email:String

})
const Student = mongoose.model('Student',studentSchema)

app.post('/student',(req,res)=>{
    let student = new Student(req.body);
    student.save()
    .then(doc => {
        res.send(doc)
        console.log(doc)
    })
    .catch(err => console.log(err))
})
app.listen(5000)