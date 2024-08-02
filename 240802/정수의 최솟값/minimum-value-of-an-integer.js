const fs = require("fs");
let [a, b, c] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

function minNum(a, b, c){
    return Math.min(a, b, c);
}

console.log(minNum(a, b, c));