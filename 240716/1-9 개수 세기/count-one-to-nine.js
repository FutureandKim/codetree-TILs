const fs = require("fs");
let [n, nums] = fs.readFileSync(0).toString().trim().split("\n");
let arr = nums.split(" ").map(Number);

//숫자별 출현 횟수 배열
let cntArr = Array(9).fill(0);

for(let i = 0; i < arr.length; i++)
    cntArr[arr[i]-1]++;

for(let i = 0; i < 9; i++)
    console.log(cntArr[i]);