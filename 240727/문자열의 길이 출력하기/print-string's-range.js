const fs = require("fs");
let [s1, s2] = fs.readFileSync(0).toString().trim().split("\n");

console.log(s1.length + s2.length);