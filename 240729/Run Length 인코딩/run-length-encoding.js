const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("");

let str = "";
let cnt = 1;
let c = input[0];

for(let i = 1; i < input.length; i++){
    if(c === input[i]) cnt++;
    else {
        str += c + cnt;
        cnt = 1;
        c = input[i];
    }
}

str += c + cnt;
cnt = 1;

console.log(str.length);
console.log(str);