import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] grid;
    public static boolean[] visited;
    public static int maxSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        choose(0, 0);

        System.out.println(maxSum);
    }

    public static void choose(int row, int currentSum) {
        if (row == n) {
            maxSum = Math.max(maxSum, currentSum);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!visited[col]) {
                visited[col] = true;
                choose(row + 1, currentSum + grid[row][col]);
                visited[col] = false;
            }
        }
    }
}