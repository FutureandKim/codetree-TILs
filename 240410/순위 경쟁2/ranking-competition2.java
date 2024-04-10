import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, cnt = 0;
        String origin = "AB"; // 명예에 전당에 올라가있는 사람
        String new_winner = ""; // 명예에 전당에 새로 올라가는 사람

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int score = sc.nextInt();

            if(c == 'A')
                a += score;
            else if(c == 'B')
                b += score;

            if(a == b)
                new_winner  = "AB";
            else if(a < b)
                new_winner = "B";
            else if(a > b)
                new_winner = "A";

            // 명예의 전당에 있던 사람과 새롭게 올라간 사람이 다르다면 cnt 증가
            if(!origin.equals(new_winner)){
                cnt++;
                new_winner = origin;
            }
        }
        System.out.print(cnt);
    }
}