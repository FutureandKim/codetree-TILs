const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0]);

const memo = [];
const getFibo = (n) => {
    if(n <= 1){
        return n;
    }
    if(memo[n] !== undefined) {
        return memo[n]
    }

    memo[n] = getFibo(n-1) + getFibo(n-2);
    return memo[n]
}
console.log(getFibo(n));
