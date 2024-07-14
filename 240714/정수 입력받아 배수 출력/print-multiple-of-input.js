const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

let res = "";
for(let i = n; i <= n*5; i+=n)
    res += i + " ";
console.log(res);