import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxBlockSize = 0;
    static int explosionCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int blockSize = dfs(i, j, grid[i][j]);
                    if (blockSize >= 4) {
                        explosionCount++;
                    }
                    maxBlockSize = Math.max(maxBlockSize, blockSize);
                }
            }
        }
        System.out.println(explosionCount + " " + maxBlockSize);
    }

    static int dfs(int x, int y, int value) {
        visited[x][y] = true;
        int size = 1; // 현재 위치 포함

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 범위를 벗어나지 않고 같은 숫자이며 방문하지 않은 경우에만 탐색
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && grid[nx][ny] == value) {
                size += dfs(nx, ny, value);
            }
        }
        
        return size;
    }
}