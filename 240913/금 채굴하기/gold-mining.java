import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt(); // 금 있으면 1, 없으면 0
            }
        }

        int maxGold = 0;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int k = 0; k <= n; k++) {
                    int gold = countGold(map, n, x, y, k);
                    int cost = calculateCost(k);

                    // 금의 수익이 비용보다 크거나 같은 경우만 고려
                    if (gold * m >= cost) {
                        maxGold = Math.max(maxGold, gold);
                    }
                }
            }
        }

        System.out.println(maxGold);
    }

    // 채굴 가능 여부를 판단하는 함수
    static int countGold(int[][] map, int n, int x, int y, int k) {
        int goldCount = 0;

        for (int dx = -k; dx <= k; dx++) {
            int range = k - Math.abs(dx);
            for (int dy = -range; dy <= range; dy++) {
                int nx = x + dx;
                int ny = y + dy;

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    goldCount += map[nx][ny];
                }
            }
        }
        return goldCount;
    }

    static int calculateCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }
}