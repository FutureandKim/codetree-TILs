import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] width = new int[2001][2001];
        // 직사각형 A
        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;

        // 직사각형 B
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;

        // 직사각형 M
        int mx1 = sc.nextInt() + 1000;
        int my1 = sc.nextInt() + 1000;
        int mx2 = sc.nextInt() + 1000;
        int my2 = sc.nextInt() + 1000;

        // 직사각형 A와 B, M 넓이에 1 채우기
        for(int i = ay1; i < ay2; i++){
            for(int j = ax1; j < ax2; j++)
                width[i][j] += 1;
        }
        for(int i = by1; i < by2; i++){
            for(int j = bx1; j < bx2; j++)

                width[i][j] += 1;
        }
        for(int i = my1; i < my2; i++){
            for(int j = mx1; j < mx2; j++)
                width[i][j] -= 1;
        }   

        // 직사각형 A,B 중 1인 칸의 개수
        int cnt = 0;
        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                if(width[i][j] == 1)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}