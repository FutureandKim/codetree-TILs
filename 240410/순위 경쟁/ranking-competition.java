import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0, cnt = 0;
        String origin = "ABC"; // 명예에 전당에 올라가있는 사람
        int maxNum = 0;

        for(int i = 0; i < n; i++){
            String new_winner = ""; // 명예에 전당에 새로 올라가는 사람
            char p = sc.next().charAt(0);
            int score = sc.nextInt();

            if(p == 'A')
                a += score;
            else if(p == 'B')
                b += score;
            else if(p == 'C')
                c += score;
            
            maxNum = Math.max(a, Math.max(b, c));

            if(maxNum == a)
                new_winner += "A";
            if(maxNum == b)
                new_winner += "B";
            if(maxNum == c)
                new_winner += "C";

            // 명예의 전당에 있던 사람과 새롭게 올라간 사람이 다르다면 cnt 증가
            if(!origin.equals(new_winner)){
                cnt++;
                origin = new_winner;
            }
        }
        System.out.print(cnt);
    }
}