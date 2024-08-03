class Student {
    constructor(name, kor, eng, math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = input[0];
const students = [];

for(let i = 1; i <= n; i++){
    const [name, kor, eng, math] = input[i].split(" ");
    students.push(new Student(name, Number(kor), Number(eng), Number(math)));
}

students.sort((prev, cur) => {
    if(prev.kor === cur.kor){
        if(prev.eng === cur.eng)
            return cur.math - prev.math;
        return cur.eng - prev.eng;
    }
    return cur.kor - prev.kor;
});

for(let i = 0; i < n; i++)
    console.log(students[i].name +  " " + students[i].kor +  " " + students[i].eng +  " " + students[i].math);