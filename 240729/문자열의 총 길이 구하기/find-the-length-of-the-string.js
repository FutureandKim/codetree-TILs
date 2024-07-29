const fs = require("fs");
let arr = fs.readFileSync(0).toString().trim().split(" ");

let cnt = 0;
for(let i = 0; i < 10; i++)
    cnt += arr[i].length;

console.log(cnt);