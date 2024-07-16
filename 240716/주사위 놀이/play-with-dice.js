const fs = require("fs");
let num = fs.readFileSync(0).toString().trim().split(" ").map(Number);

//각 숫자 카운트를 위한 배열
let cntArr = Array(6).fill(0);

for(let i = 0; i < num.length; i++)
    cntArr[num[i]-1]++;

for(let i = 0; i < 6; i++)
    console.log(`${i+1} - ${cntArr[i]}`);