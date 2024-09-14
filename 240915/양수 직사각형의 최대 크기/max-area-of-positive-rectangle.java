import java.util.Scanner;

public class Main {
    
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxArea = -1;

        // 직사각형 만들고 양수 직사각형인지 확인
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                for (int x2 = x1; x2 < n; x2++) {
                    for (int y2 = y1; y2 < m; y2++) {
                        if (isPositiveRectangle(x1, y1, x2, y2)) {
                            int area = (x2 - x1 + 1) * (y2 - y1 + 1);
                            maxArea = Math.max(maxArea, area);
                        }
                    }
                }
            }
        }
        System.out.println(maxArea);
    }

    // 모두 양수인지 확인하는 함수
    public static boolean isPositiveRectangle(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}