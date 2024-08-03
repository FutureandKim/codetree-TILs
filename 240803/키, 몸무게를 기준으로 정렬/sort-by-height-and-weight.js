class Student{
    constructor(name, height, weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0]);
const students = [];

for(let i = 1; i <= n; i++){
    const [name, height, weight] = input[i].split(' ');
    students.push(new Student(name, Number(height), Number(weight)));
}

students.sort((prev, cur) => {
    if(prev.height === cur.height)
        return cur.weight - prev.weight;
    return prev.height - cur.height;
});

for(let i = 0; i < n; i++)
    console.log(students[i].name + " " + students[i].height + " " + students[i].weight);