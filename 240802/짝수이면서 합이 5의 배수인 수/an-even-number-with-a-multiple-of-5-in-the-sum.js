const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

function digitSum(n){
    return Math.floor(n/10) + (n%10);
}

console.log((digitSum(n) % 5 == 0 && n % 2 == 0) ? "Yes" : "No");