const fs = require("fs");
let [n, num] = fs.readFileSync(0).toString().trim().split("\n");

n = Number(n);
let numbers = num.split(" ").map(Number);

const evenArr = []; //짝수 저장할 배열

for(const number of numbers){
    if(number % 2 == 0)
        evenArr.push(number);
}

let res = "";
for(let i = evenArr.length-1; i >= 0; i--)
    res += evenArr[i] + " "; //배열 역순으로 출력
console.log(res);