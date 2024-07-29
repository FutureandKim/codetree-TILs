const fs = require("fs");
const arr = ["apple", "banana", "grape", "blueberry", "orange"];
const c = fs.readFileSync(0).toString().trim();

let cnt = 0;
for(let i = 0; i < 5; i++){
    if(arr[i][2] === c || arr[i][3] === c){
        console.log(arr[i]);
        cnt++;
    }
}

console.log(cnt);