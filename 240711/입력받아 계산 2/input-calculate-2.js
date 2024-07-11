const fs = require("fs");

let a = fs.readFileSync(0).toString();
let arr = a.split(" ");

console.log(Number(arr[0]) * Number(arr[1]));