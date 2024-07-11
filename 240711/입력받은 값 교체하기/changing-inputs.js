const fs = require("fs");

let i = fs.readFileSync(0).toString();
let arr = i.split(" ");

console.log(`${arr[1]} ${arr[0]}`);