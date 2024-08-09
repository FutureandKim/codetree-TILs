const fs = require("fs");
const [n, h] = fs.readFileSync(0).toString().trim().split("\n");
const house = h.split(" ").map(Number);

let minDis = [];


for(let i = 0; i < Number(n); i++){
    let dis = 0;
    for(let j = 0; j < Number(n); j++){
        dis += house[j] * Math.abs(j - i);
    }
    minDis.push(dis);
}

minDis.sort();
console.log(minDis[0]);