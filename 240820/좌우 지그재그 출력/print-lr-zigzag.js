const fs = require("fs");
const n = Number(fs.readFileSync(0).toString().trim());

let num = 1;
for(let i = 0; i < n; i++){
    let arr = "";
    let num2 = n + num;
    for(let j = 0; j < n; j++){
        if(i % 2 === 0)
            arr += num + " ";
        else 
            arr += num2-1 + " ";
        num++;
        num2--;
    }
    console.log(arr);
}