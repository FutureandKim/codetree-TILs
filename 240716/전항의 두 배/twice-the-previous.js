const fs = require("fs");
let [n1, n2] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let arr = n1 + " " + n2 + " ";

for(let i = 0; i < 8; i++){
    let n = n2 + 2*n1;
    arr += n + " ";
    n1 = n2;
    n2 = n;
}

console.log(arr);