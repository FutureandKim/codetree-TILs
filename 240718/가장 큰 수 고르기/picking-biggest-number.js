const fs = require("fs");
let numArr = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let max = Number.MIN_SAFE_INTEGER;
for(let i = 0; i < numArr.length; i++){
    if(numArr[i] > max)
        max = numArr[i];
}

console.log(max);