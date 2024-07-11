const fs = require("fs");

let input = fs.readFileSync(0).toString();
let arr = input.split(" ");
console.log(Number(arr[0]) + Number(arr[1]));