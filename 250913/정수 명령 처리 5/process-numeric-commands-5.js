const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const commands = input.slice(1);

const numberList = [];
const processCommand = (commandLine) => {
    const[command, num] = commandLine.split(' ');
    switch(command) {
        case "push_back":
            numberList.push(num);
            break;
        case "pop_back":
            numberList.pop();
            break;
        case "size":
            console.log(numberList.length);
            break;
        case "get":
            console.log(numberList[Number(num)-1]);
            break;
        default:
            break;
    }
}

for(let i = 1; i <= n; i++) {
    processCommand(input[i]);
}

