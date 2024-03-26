//import {mongoClient} from 'mongodb'

import { MongoClient } from "mongodb"

// const client = new mongoClient('mongodb://localhost:27017')
const  client = new MongoClient('mongodb://localhost:27017')
client.connect()
.then(()=>{
    console.log("connected successfully")
    console.log('existing')
    client.close()
})
.catch(error => console.log("failed to connect ", error))