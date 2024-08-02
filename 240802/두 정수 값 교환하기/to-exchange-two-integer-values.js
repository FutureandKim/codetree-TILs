const fs = require("fs");
let [n, m] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

function swap(n, m){
    [n, m] = [m, n];
    console.log(n, m);
}

swap(n, m);