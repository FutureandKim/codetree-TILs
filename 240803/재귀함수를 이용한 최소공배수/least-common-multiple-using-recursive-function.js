const fs = require("fs");
let [n, arr] = fs.readFileSync(0).toString().trim().split("\n");
arr = arr.split(" ").map(Number);

function gcd(a, b){
    if (a < b)
        [a, b] = [b, a];
    else if(b == 0)
        return a;
    return gcd(b, a%b);
}

function lcm(a, b){
    return Math.floor(a*b/gcd(a,b));
}

let res = Math.floor(arr[0]);
arr.forEach((e) => {
    res = lcm(e, res);
})

console.log(res);