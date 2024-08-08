const fs = require("fs");
const [start, end] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let cnt = 0;
for(let i = start; i <= end; i++){
    let divisior = [];
    for(let j = 1; j <= i; j++){
        if(i % j === 0)
            divisior.push(j);
    }

    if(divisior.length === 3)
        cnt++;
}

console.log(cnt);