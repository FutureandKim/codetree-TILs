// 키 기준 오름차순 정렬
function cmp(prev, cur){
    return prev.height - cur.height;
}

class Person {
    constructor(name, height, weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split("\n");
const n = Number(input[0]);

const people = [];
for(let i = 1; i <= n; i++){
    const [name, height, weight] = input[i].split(" ");
    people.push(new Person(name, Number(height), Number(weight)));
}

// 키 오름차순 정렬
people.sort(cmp);
for(let i in people)
    console.log(people[i].name + " " + people[i].height + " " + people[i].weight);