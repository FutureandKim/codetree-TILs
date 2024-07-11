const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split("\n");
let arr = input[0].split(" ");
console.log(Number(arr[0]), Number(arr[1]), Number(input[1]));