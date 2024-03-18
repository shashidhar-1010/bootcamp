class Person{
    constructor(name,age){
        this.name=name;
        this.age=age;
    }
    display(){
        console.log(`Name: ${this.name}  ,  Age: ${this.age}`);
    }
}
const person1 = new Person("shashi",22);
const person2 = new Person("ravi",45);

person1.display();
person2.display();


//include getters and setters