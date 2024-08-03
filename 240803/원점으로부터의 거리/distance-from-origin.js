class Dot {
    constructor(num, x, y){
        this.num = num;
        this.x = x;
        this.y = y;
    }
}

const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0]);
const dots = [];

for(let i = 1; i <= n; i++){
    const [x, y] = input[i].split(" ");
    dots.push(new Dot(i, Number(x), Number(y)));
}

dots.sort((prev, cur) => {
    return (Math.abs(prev.x) + Math.abs(prev.y)) - (Math.abs(cur.x) + Math.abs(cur.y));
})

for(let i = 0; i < n; i++)
    console.log(dots[i].num);