const fs = require("fs");
let [str, c] = fs.readFileSync(0).toString().trim().split("\n");

let cnt = 0;
for(let i = 0; i < str.length; i++)
    if(str[i] === c) cnt++;


console.log(cnt);