import java.util.Scanner;

public class Main {
    static int N, M;
    static char[][] grid;
    static String target = "LEE";
    static int[][] directions = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1},
        {-1, -1}, {-1, 1}, {1, -1}, {1, 1} 
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new char[N][M];

        for (int i = 0; i < N; i++) {
            grid[i] = scanner.next().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'L') {
                    count += countLEE(i, j);
                }
            }
        }
        System.out.println(count);
    }

    public static int countLEE(int row, int col) {
        int found = 0;
        
        for (int[] direction : directions) {
            int dx = row;
            int dy = col;
            boolean match = true;

            for (int k = 0; k < target.length(); k++) {
                if (dx < 0 || dx >= N || dy < 0 || dy >= M || grid[dx][dy] != target.charAt(k)) {
                    match = false;
                    break;
                }
                dx += direction[0];
                dy += direction[1];
            }
            
            if (match) found++;
        }
        
        return found;
    }
}