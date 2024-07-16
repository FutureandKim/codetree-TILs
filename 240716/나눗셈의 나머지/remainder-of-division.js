const fs = require("fs");
let [a, b] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

//나머지가 나온 횟수를 저장할 배열
let rArr = Array(b).fill(0);

while(a > 1){
    let q = Math.floor(a/b);
    rArr[a % b]++;
    a = q;
}

let sum = 0;
for(let i = 0; i < b; i++)
    sum += rArr[i]**2;

console.log(sum);