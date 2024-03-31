// let values = [65,87]
// //const numbers = [23,45,66]
// numbers.push(123);
// console.log(numbers)
// console.log('hi')

//filter
const numbers = [23,45,66]
let oddValues = numbers.filter(oddnumbers)
console.log(oddValues)

function oddnumbers(num){
    return num%2 !=0;
}

// map
let doubleValues = numbers.map(getDouble)
console.log(doubleValues)

function getDouble(n){
    return 2*n;

}
//reduceD
let sum = numbers.reduce(getSum , 0)
console.log(sum)

function getSum(total , num){
    return total+num;

}