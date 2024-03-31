function changeText(){
    let x="hi"
    document.getElementById("para1").innerHTML="hello"
}

function createParagraph(){
    let paragraph = document.createElement("p")
    let text = document.createTextNode("this text is created from the dom itself")
    paragraph.appendChild(text)
    document.body.appendChild(paragraph)
}
document.getElementById("bt1").addEventListener("mouseover",()=>alert("listerner called"))