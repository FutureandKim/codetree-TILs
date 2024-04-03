import java.util.Scanner;

public class Main {
    public static int[][] dot;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dot = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                dot[i][j] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    max = Math.max(max, getTriangle(i, j, k));
                }
            }
        }
        System.out.print(max);
    }

    public static int getTriangle(int i, int j, int k) {
        int x1 = dot[i][0], x2 = dot[j][0], x3 = dot[k][0];
        int y1 = dot[i][1], y2 = dot[j][1], y3 = dot[k][1];

        // x축에 평행한 변을 찾기
        int base = Math.abs(x1 - x2) == 0 ? x1 : (Math.abs(x1 - x3) == 0 ? x1 : x2);
        // y축에 평행한 변을 찾기
        int height = Math.abs(y1 - y2) == 0 ? y1 : (Math.abs(y1 - y3) == 0 ? y1 : y2);

        // 삼각형의 넓이 계산
        int area = Math.abs((base - x3) * (height - y3));

        return area;
    }
}