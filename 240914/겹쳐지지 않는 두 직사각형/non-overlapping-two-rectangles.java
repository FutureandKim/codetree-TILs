import java.util.Scanner;

public class Main {

    static int[][] grid;

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

        int maxSum = Integer.MIN_VALUE;

        // 직사각형1
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                for (int x2 = x1; x2 < n; x2++) {
                    for (int y2 = y1; y2 < m; y2++) {
                        int firstRectSum = calculateSum(x1, y1, x2, y2);
                        
                        // 직사각형2
                        for (int a1 = 0; a1 < n; a1++) {
                            for (int b1 = 0; b1 < m; b1++) {
                                for (int a2 = a1; a2 < n; a2++) {
                                    for (int b2 = b1; b2 < m; b2++) {
                                        // 겹치는지 확인
                                        if (!isOverlapping(x1, y1, x2, y2, a1, b1, a2, b2)) {
                                            int secondRectSum = calculateSum(a1, b1, a2, b2);
                                            maxSum = Math.max(maxSum, firstRectSum + secondRectSum);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxSum);
    }

    // 직사각형 합 구하는 함수
    public static int calculateSum(int x1, int y1, int x2, int y2) {
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    // 겹치는지 확인하는 함수
    public static boolean isOverlapping(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
        return !(x2 < a1 || x1 > a2 || y2 < b1 || y1 > b2);
    }
}