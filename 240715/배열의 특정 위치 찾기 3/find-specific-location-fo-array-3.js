const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let sum = 0;
for(let i = 0; i < input.length; i++){
    if(input[i] == 0){
        sum += input[i-3] + input[i-2] + input[i-1];
        break;
    }
}

console.log(sum);