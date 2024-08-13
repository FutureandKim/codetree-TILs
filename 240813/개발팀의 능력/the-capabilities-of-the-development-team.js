const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split(" ").map(Number);

// 2명 뽑는 조합 함수
function selectTwo(arr) {
    let group = [];
    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            group.push([arr[i], arr[j]]);
        }
    }
    return group;
}

// 모든 팀 조합을 만들고 유효성을 검사하는 함수
function generateAndValidateTeams() {
    const allGroups = [];

    let pairs = selectTwo(input);

    for (let i = 0; i < pairs.length; i++) {
        let [a1, a2] = pairs[i];
        let remaining = input.filter(x => x !== a1 && x !== a2);
        
        if (remaining.length < 3) continue;

        let pairs2 = selectTwo(remaining);

        for (let j = 0; j < pairs2.length; j++) {
            let [b1, b2] = pairs2[j];
            let remaining2 = remaining.filter(x => x !== b1 && x !== b2);
            let [c1] = remaining2;

            let abilities = [
                a1 + a2,
                b1 + b2,
                c1
            ];
            
            if (new Set(abilities).size === abilities.length) {
                allGroups.push(abilities.sort((x, y) => x - y));
            }
        }
    }

    return allGroups;
}

// 팀 능력치의 차이 계산
function findMinimumDifference() {
    let allTeams = generateAndValidateTeams();

    if (allTeams.length === 0) return -1;

    let minDifference = Infinity;

    for (let team of allTeams) {
        let difference = team[2] - team[0];
        if (difference < minDifference) {
            minDifference = difference;
        }
    }

    return minDifference;
}

console.log(findMinimumDifference());