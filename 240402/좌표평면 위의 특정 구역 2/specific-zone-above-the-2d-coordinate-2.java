import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[n][2];
        int minWidth = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            // i == j 인 경우 제외하고 X좌표 순환
            for(int j = 0; j < n; j++){
                if(j != i){
                    minX = Math.min(minX, p[j][0]);
                    maxX = Math.max(maxX, p[j][0]);
                }
            }        

            // i == j 인 경우 제외하고 Y좌표 순환
            for(int j = 0; j < n; j++){
                if(j != i){
                    minY = Math.min(minY, p[j][1]);
                    maxY = Math.max(maxY, p[j][1]);
                }
            }        

            // 사각형의 넓이
            int res = (maxX - minX) * (maxY - minY);
            minWidth = Math.min(minWidth, res);
        }
        System.out.print(minWidth);
    }
}