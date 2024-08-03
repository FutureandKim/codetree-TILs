const fs = require("fs");
const [a, b, c, d] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

const strt = a * 60 + b;
const fin = c * 60 + d;

console.log(fin - strt);