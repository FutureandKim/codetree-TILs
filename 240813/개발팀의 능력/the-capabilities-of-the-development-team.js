const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split(" ").map(Number);

// 2명 뽑는 조합 함수
function selectTwo(arr, n){
    let group = [];
    if(n === 1) return arr.map(el => [el]);
    arr.forEach((el, i) => {
        const selectTwoPerson = selectTwo(arr.slice(i+1), n - 1);
        selectTwoPerson.forEach(two => {
            group.push([el, ...two]);
        });
    });
    return group;
}

// 모든 조합 경우의 수
function allGroup(){
    let g1 = selectTwo(input, 2);
    const allGroups = [];

    g1.forEach(groupA => {
        const remain = input.filter(el => !groupA.includes(el));
        let g2 = selectTwo(remain, 2);

        g2.forEach(groupB =>{
            const remain2 = remain.filter(el => !groupB.includes(el));
            let groupC = remain2;
            let arr = [groupA[0]+groupA[1], groupB[0]+groupB[1], groupC[0]]; // 능력치를 더한 값을 구하기
            arr.sort();
            allGroups.push(arr); 
        })
    })
    return allGroups;
}

let all = allGroup();
for(let i = 0; i < all.length; i++){
    if(all[i][0] === all[i][1] || all[i][1] === all[i][2])
        all.splice(i, 1);
}

let sumArr = [];
for(let i = 0; i < all.length; i++){
    sumArr.push(all[i][2] - all[i][0]);
}

sumArr.sort();
const res = sumArr.find(el => el !== 0);
console.log(res !== undefined ? res : -1);