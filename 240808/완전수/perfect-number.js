const fs = require("fs");
const [a, b] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let cnt = 0;
for(let i = a; i <= b; i++){
    let divisor = [];
    for(let j = 1; j < i; j++){
        if(i % j === 0)
            divisor.push(j);
    }

    let sum = 0;
    for(let j = 0; j < divisor.length; j++){
        sum += divisor[j];
    }

    if(sum === i)
        cnt++;
}

console.log(cnt);