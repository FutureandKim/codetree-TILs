import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[4];
        int cnt = 1, sum = 0, pass_num = 0;

        while(cnt <= n){
            for(int i = 0; i < 4; i++){
                score[i] = sc.nextInt();
                sum += score[i];
            }

            double avg = (double)sum / 4;

            if(avg >= 60){
                System.out.println("pass");
                pass_num++;
            }
            else
                System.out.println("fail");

            sum = 0;
            cnt++;
        }
        System.out.print(pass_num);
    }
}