const fs = require("fs");
let [n, s] = fs.readFileSync(0).toString().trim().split("\n");

n = Number(n);
let scores = s.split(" ").map(Number);

let sum = 0;
for(let score of scores)
    sum += score;

let avg = sum / n;
console.log(avg.toFixed(1));

if(avg >= 4.0)
    console.log("Perfect");
else if(avg >= 3.0)
    console.log("Good");
else
    console.log("Poor");