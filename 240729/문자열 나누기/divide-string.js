const fs = require("fs");
let [n, str] = fs.readFileSync(0).toString().trim().split("\n");
str = str.split(" ").join("");

let res = "";
let cnt = 0;
for(let c of str){
    res += c;
    cnt++;
    if(cnt === 5){
        console.log(res);
        res = "";
        cnt = 0;
    }
}
console.log(res);