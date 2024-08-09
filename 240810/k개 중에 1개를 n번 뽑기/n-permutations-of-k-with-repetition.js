const fs = require("fs");
const [k, n] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let res = [];

function printRes(){
    let resStr = "";
    for(let elem of res)
        resStr += elem + " ";
    console.log(resStr);
}

function selectNum(num){

    if(num == n)
        return printRes();
    
    for(let i = 1; i <= k; i++){
        res.push(i);
        selectNum(num+1);
        res.pop();
    }
    return;
}

selectNum(0);