import java.util.Scanner;

public class Main {
    public static int[][] dot;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dot = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++)
                dot[i][j] = sc.nextInt();
        }

        int maxArea = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int area = getTriangleArea(i, j, k);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        System.out.print(maxArea * 2);
    }

    // 한 변이 x축에 평행, 다른 변이 y축에 평행한 삼각형의 넓이를 계산하는 함수
    public static int getTriangleArea(int i, int j, int k) {
        int x1 = dot[i][0], x2 = dot[j][0], x3 = dot[k][0];
        int y1 = dot[i][1], y2 = dot[j][1], y3 = dot[k][1];
        int width = 0, height = 0;

        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            // 한 변이 x축 또는 y축에 평행한 삼각형이 아닌 경우
            return 0;
        }

        // 삼각형의 넓이를 계산
        if (x1 == x2) {
            height = Math.abs(y3 - y1);
            width = Math.abs(x3 - x1);
        } else if (x1 == x3) {
            height = Math.abs(y2 - y1);
            width = Math.abs(x2 - x1);
        } else if (x2 == x3) {
            height = Math.abs(y1 - y2);
            width = Math.abs(x1 - x2);
        }

        return width * height * 1/2;
    }
}