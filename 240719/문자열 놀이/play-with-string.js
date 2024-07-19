const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("\n");
let [question, n] = input[0].toString().trim().split(" ");

for(let i = 1; i <= n; i++){
    let [qNum, idx1, idx2] = input[i].toString().trim().split(" ");
    let questionSplit = question.split('');
    
    if(Number(qNum) === 1){
        let temp = questionSplit[idx1-1];
        questionSplit[idx1-1] = questionSplit[idx2-1];
        questionSplit[idx2-1] = temp;
    }

    else if(Number(qNum) === 2){
        for(let i = 0; i < questionSplit.length; i++){
            if(questionSplit[i] == idx1)
                questionSplit[i] = idx2;
        }
    }

    question = questionSplit.join('');
    console.log(question);

}