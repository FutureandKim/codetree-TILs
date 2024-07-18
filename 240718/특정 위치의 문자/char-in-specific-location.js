const fs = require("fs");
let arr = ['L', 'E', 'B', 'R', 'O', 'S'];
let c = fs.readFileSync(0).toString().trim();

let idx = -1;
for(let i = 0; i < arr.length; i++){
    if(arr[i] === c){
        console.log(i);
        idx = i;
        break;
    }
}

if(idx === -1) console.log("None");