class Student {
    constructor(name, s1, s2, s3){
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
}

const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0]);
const students = [];

for(let i = 1; i <= n; i++){
    const [name, s1, s2, s3] = input[i].split(" ");
    students.push(new Student(name, Number(s1), Number(s2), Number(s3)));
}

students.sort((prev, cur) => {
    return(prev.s1 + prev.s2 + prev.s3) - (cur.s1 + cur.s2 + cur.s3);
});

for(let i = 0; i < n; i++)
    console.log(students[i].name + " " +  students[i].s1 + " " + students[i].s2 + " " + students[i].s3);