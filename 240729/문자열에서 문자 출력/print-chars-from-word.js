const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("");

for(let i of input)
    console.log(i);