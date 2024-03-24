import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 직사각형 A
        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;
        int[][] a_width = new int[2000][2000];

        // 직사각형 B
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;
        int[][] b_width = new int[2000][2000];

        // 직사각형 M
        int mx1 = sc.nextInt() + 1000;
        int my1 = sc.nextInt() + 1000;
        int mx2 = sc.nextInt() + 1000;
        int my2 = sc.nextInt() + 1000;
        int[][] m_width = new int[2000][2000];

        // 직사각형 A와 B, M 넓이에 1 채우기
        for(int i = ay1; i < ay2; i++){
            for(int j = ax1; j < ax2; j++)
                a_width[i][j] += 1;
        }
        for(int i = by1; i < by2; i++){
            for(int j = bx1; j < bx2; j++)

                b_width[i][j] += 1;
        }
        for(int i = my1; i < my2; i++){
            for(int j = mx1; j < mx2; j++)
                m_width[i][j] -= 1;
        }   

        // 직사각형 A,B 중 1인 칸의 개수
        int cnt = 0;
        for(int i = ay1; i < ay2; i++){
            for(int j = ax1; j < ax2; j++){
                if(a_width[i][j] == 1 && m_width[i][j] == 0)
                    cnt++;
            }
        }
        for(int i = by1; i < by2; i++){
            for(int j = bx1; j < bx2; j++){
                if(b_width[i][j] == 1 && m_width[i][j] == 0)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}