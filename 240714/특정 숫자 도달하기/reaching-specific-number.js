const fs = require("fs");
let num = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let sum = 0;
let cnt = 0;

for(let i = 0; i < 10; i++){
    if(num[i] >= 250)
        break;
    sum += Number(num[i]);
    cnt++;
}

let avg = (sum/cnt).toFixed(1);
console.log(sum, avg);