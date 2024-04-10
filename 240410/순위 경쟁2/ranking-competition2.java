import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, cnt = 0;
        String s = "AB"; // 명예에 전당에 올라가있는 사람
        String win = ""; // 명예에 전당에 새로 올라가는 사람

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int score = sc.nextInt();

            if(c == 'A')
                a += score;
            else if(c == 'B')
                b += score;

            if(a == b)
                win  = "AB";
            else if(a < b)
                win = "B";
            else if(a > b)
                win = "A";

            if(!s.equals(win)){
                cnt++;
                s = win;
            }
        }
        System.out.print(cnt);
    }
}