const fs = require("fs");
let [n, input] = fs.readFileSync(0).toString().trim().split("\n");

let str = "";
for(let i = 0; i < input.length; i++){
    if(input[i] != " ")
        str += input[i];
}

let res = "";
let cnt = 0, num = 0;
for(let i = 0; i < str.length; i++){
    res += str[i];
    cnt++;
    if(cnt === 5){
        console.log(res);
        res = "";
        cnt = 0;
        num++;
    }
}
console.log(num);