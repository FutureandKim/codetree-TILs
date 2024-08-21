const fs = require("fs");
const n = Number(fs.readFileSync(0).toString().trim());

let num = 1;
for(let i = 0; i < n; i++){
    let res = "";
    for(let j = 0; j < n; j++){
        if(i > j) 
            res += "  ";
        else 
            res += num++ + " ";

        if(num === 10)
            num = 1;
    }
    console.log(res);
}