const fs = require("fs");

//객체 선언
class Gong07{
    constructor(code, place, time){
        this.code = code;
        this.place = place;
        this.time = time;
    }
}

let [code, place, time] = fs.readFileSync(0).toString().trim().split(" ");
const ggc = new Gong07(code, place, time);

console.log(`secret code : ${ggc.code}`);
console.log(`meeting point : ${ggc.place}`);
console.log(`time : ${ggc.time}`);