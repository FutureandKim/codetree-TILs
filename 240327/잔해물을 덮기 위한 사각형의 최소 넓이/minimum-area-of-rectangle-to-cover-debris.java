import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] box = new int[2001][2001];
        int cnt = 0;

        // 첫번째 직사각형
        int fx1 = sc.nextInt() + 1000;
        int fy1 = sc.nextInt() + 1000;
        int fx2 = sc.nextInt() + 1000;
        int fy2 = sc.nextInt() + 1000;

        // 두번째 직사각형
        int sx1 = sc.nextInt() + 1000;
        int sy1 = sc.nextInt() + 1000;
        int sx2 = sc.nextInt() + 1000;
        int sy2 = sc.nextInt() + 1000;

        // 첫번째 직사각형 부분 칠하기
        for(int i = fx1; i < fx2; i++){
            for(int j = fy1; j < fy2; j++)
                box[i][j]++;
        }

        // 두번째 직사각형 부분 칠하기
        for(int i = sx1; i < sx2; i++){
            for(int j = sy1; j < sy2; j++)
                box[i][j]++;
        }

        // 첫번째 사각형 범위에서 값이 1인 최대, 최소 x좌표 값 구하기
        int minX = fx2, maxX = fx1;
        for(int i = fx1; i < fx2; i++){
            for(int j = fy1; j < fy2; j++){
                if(box[i][j] == 1){
                    if(i < minX)
                        minX = i;
                    if(i > maxX)
                        maxX = i;
                }
            }
        }

        // 두번째 사각형 범위에서 값이 1인 최대, 최소 x좌표 값 구하기
        int minY = fy2, maxY = fy1;
        for(int i = fx1; i < fx2; i++){
            for(int j = fy1; j < fy2; j++){
                if(box[i][j] == 1){
                    if(j < minY)
                        minY = j;
                    if(j > maxY)
                        maxY = j;
                }
            }
        }

        int width = (maxX-minX+1) * (maxY-minY+1);
        if(fx1 >= sx1 && fy1 >= sy1 && fx2 <= sx2 && fy2 <= sy2)
            width = 0;

        System.out.print(width);
    }
}