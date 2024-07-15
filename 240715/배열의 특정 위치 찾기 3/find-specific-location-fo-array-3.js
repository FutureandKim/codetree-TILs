const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let sum = 0;
for(let i = 0; i < input.length; i++){
    sum += input[i];
    if(input[i] == 0)
        break;
}

console.log(sum);