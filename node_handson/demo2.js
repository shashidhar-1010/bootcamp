import bodyParser from 'body-parser';
import express from 'express'
const app = express();



// const express = require('express');
// const app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));


app.post('/user', (req, res) => {
    const employee = req.body;
    const name = employee.name;
    const age = employee.age;
    const hoursWorked = employee.hours;
    const role = employee.role;
 
    let salary;
 
    switch (role) {
        case 'Manager':
            employee.salary = hoursWorked * 90;
            break;
        case 'Consultant':
            employee.salary = hoursWorked * 60;
            break;
        case 'Trainee':
            employee.salary = hoursWorked * 40;
            break;
        default:
            employee.salary = 0;
    }

    res.send(employee)
 
 
 
    // res.send({
    //     message: "The Employee is added",
    //     employee:
    //     {
    //         "name": name,
    //         "age": age,
    //         "hours": hoursWorked,
    //         "role": role
    //     }
    // })
}).listen(5000)