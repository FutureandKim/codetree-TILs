const fs = require("fs");
const n = Number(fs.readFileSync(0).toString().trim());

let res = [];
for(let i = 2; i <= n; i++){
    for(let j = 2; j < i; j++){      
        if(j === i-1 && i % j != 0)
            res.push(i);
        
        if(i % j === 0)
            break;
    }
}

let resStr = "2 ";
for(let i = 0; i < res.length; i++)
    resStr += res[i] + " ";
console.log(resStr);