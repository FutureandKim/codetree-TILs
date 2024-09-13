import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static int[] dx = {1, 1, -1, -1}; // 아래, 왼쪽 위, 위, 오른쪽 아래
    static int[] dy = {-1, 1, 1, -1}; // 왼쪽, 위, 오른쪽, 아래

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;

        // d1, d2에 대해 완전탐색
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int d1 = 1; d1 < n; d1++) {
                    for (int d2 = 1; d2 < n; d2++) {
                        int sum = getSum(x, y, d1, d2);
                        if (sum != -1) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
    
    // 기울어진 직사각형 합 계산하는 함수
    static int getSum(int x, int y, int d1, int d2) {
        int sum = 0;
        
        // 아래
        int nx = x, ny = y;
        for (int i = 0; i < d1; i++) {
            nx += dx[0];
            ny += dy[0];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) return -1;
            sum += grid[nx][ny];
        }
        
        // 왼쪽 위
        for (int i = 0; i < d2; i++) {
            nx += dx[1];
            ny += dy[1];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) return -1;
            sum += grid[nx][ny];
        }

        // 위
        for (int i = 0; i < d1; i++) {
            nx += dx[2];
            ny += dy[2];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) return -1;
            sum += grid[nx][ny];
        }

        // 오른쪽 아래
        for (int i = 0; i < d2; i++) {
            nx += dx[3];
            ny += dy[3];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) return -1;
            sum += grid[nx][ny];
        }

        return sum;
    }
}