//asynchronous java script
//XMLHTTPrequest - core component
//let XMLHTTPrequest = require("xmlhttprequest").XMLHTTPrequest;
let xhr = new XMLHttpRequest()

xhr.onreadystatechange= function f(){
    if(xhr.readyState === 4 && xhr.status === 200){  //ready state range [0,4] 0:unsent , 1:opened , 2:
        const jsonData = JSON.parse(xhr.responseText)
        console.log(jsonData)
    }
    else{
        console.error("error :"+xhr.status)
    }
        console.log(xhr.responseText)
    }

xhr.open("GET" ,"https://jsonplaceholder.typicode.com/posts")
xhr.send()