import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[4];
        int cnt = 1, sum = 0, pass_num = 0; // 학생 수 카운트, 점수 합, 통과한 학생 수

        while(cnt <= n){
            // 4과목 점수 입력
            for(int i = 0; i < 4; i++){
                score[i] = sc.nextInt();
                sum += score[i];
            }

            // 평균 구하기
            double avg = (double)sum / 4;

            if(avg >= 60){
                System.out.println("pass");
                pass_num++;
            }
            else
                System.out.println("fail");

            // 점수 합 초기화, cnt 증가
            sum = 0;
            cnt++;
        }
        System.out.print(pass_num);
    }
}