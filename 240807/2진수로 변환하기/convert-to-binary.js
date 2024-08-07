const fs = require("fs");
const n = Number(fs.readFileSync(0).toString().trim());

let binaryNum = n.toString(2);
console.log(binaryNum);