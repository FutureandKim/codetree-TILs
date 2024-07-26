import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s = new Stack<>();

        boolean isCorrect = true;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                s.push(str.charAt(i));
            else{
                if(str.charAt(i) == ')'){
                    if(s.empty()){
                        isCorrect = false;
                        break;
                    } else s.pop(); // 스택에 들어있던 ( 빼주기
                }
            }
        }
        if(!s.empty()) isCorrect = false; // 스택이 안비어있다면 false

        System.out.print(isCorrect == true ? "Yes" : "No");
    }
}