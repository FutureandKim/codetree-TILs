const fs = require("fs");
let [a, b] = fs.readFileSync(0).toString().split(" ");

a = Number(a);
b = Number(b);

if(a > b)
    console.log(a-b);
else
    console.log(b-a);