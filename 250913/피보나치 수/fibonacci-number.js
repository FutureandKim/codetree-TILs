const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);

const getFibo = (n) => {
    if(n <= 2) {
        return 1;
    }
    return getFibo(n-1) + getFibo(n-2);
}
console.log(getFibo(n));

