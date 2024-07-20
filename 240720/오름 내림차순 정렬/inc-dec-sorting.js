const fs = require("fs");
let [n, num] = fs.readFileSync(0).toString().trim().split("\n");
let numArr = num.toString().trim().split(" ").map(Number);

//오름차순
numArr.sort((prev, cur) => {
    return prev - cur;
});

let asc = "";
let des = "";

for(let i = 0; i < n; i++)
    asc += numArr[i] + " ";

numArr.reverse(); //내림차순

for(let i = 0; i < n; i++)
    des += numArr[i] + " ";

console.log(asc);
console.log(des);