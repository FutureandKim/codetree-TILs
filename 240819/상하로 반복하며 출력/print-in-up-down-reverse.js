const fs = require("fs");
const n = Number(fs.readFileSync(0).toString().trim());
const arr = new Array(n).fill(0).map(() => new Array(n));

for(let i = 0; i < n; i++){
    for(let j = 0; j < n; j++){
        if(i % 2 === 0){
            arr[j][i] = j+1;
        }
        else
            arr[n-j-1][i] = j+1;
    }
}

for(let i = 0; i < n; i++){
    let res = "";
    for(let j = 0; j < n; j++)
        res += arr[i][j];
    console.log(res);
}