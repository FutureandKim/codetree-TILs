const fs = require("fs");

//객체 선언
class NextLevel{
    constructor(id = "codetree", level = 10){
        this.id = id;
        this.level = level;
    }
}

const user1 = new NextLevel();

let [id, level] = fs.readFileSync(0).toString().trim().split(" ");
const user2 = new NextLevel(id, level);

console.log(`user ${user1.id} lv ${user1.level}`);
console.log(`user ${user2.id} lv ${user2.level}`);