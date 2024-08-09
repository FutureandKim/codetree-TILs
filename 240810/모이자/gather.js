const fs = require("fs");
const [n, h] = fs.readFileSync(0).toString().trim().split("\n");
const house = h.split(" ").map(Number);

let minDis = Number.MAX_SAFE_INTEGER;

for(let i = 0; i < Number(n); i++){
    let dis = 0;
    for(let j = 0; j < Number(n); j++){
        dis += house[j] * Math.abs(j - i);
    }
    minDis = Math.min(minDis, dis);
}

console.log(minDis);