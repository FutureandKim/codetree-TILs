import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dot = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                dot[i][j] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int res = distance2(dot[i][0], dot[i][1], dot[j][0], dot[j][1]);
                min = Math.min(res, min);
            }
        }
        System.out.print(min);
    }

    // 두 점 사이의 거리의 제곱을 구하는 함수
    public static int distance2(int x1, int y1, int x2, int y2){
        int res = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);
        return res;
    }
}