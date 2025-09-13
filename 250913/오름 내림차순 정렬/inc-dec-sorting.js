const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = parseInt(input[0]);
const nums = input[1].split(' ').map(Number);

const cmp = (prev, cur) => {
    return prev - cur;
}

const orderNumbers = (nums) => {
    let i = 0;
    let numbers = ''; 
    for(i = 0; i < nums.length; i++) {
        numbers += nums[i] + ' ';
    }
    return numbers;
}

console.log(orderNumbers(nums.sort(cmp)));
console.log(orderNumbers(nums.reverse()));

