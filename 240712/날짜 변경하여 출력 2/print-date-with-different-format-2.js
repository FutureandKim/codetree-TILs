const fs = require("fs");
let [m, d, y] = fs.readFileSync(0).toString().split("-");
console.log(`${y}.${m}.${d}`);