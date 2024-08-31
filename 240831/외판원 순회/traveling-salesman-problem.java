import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] cost;
    public static boolean[] visited;
    public static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cost = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        visited[0] = true;
        tsp(0, 0, 1);

        System.out.println(minCost);
    }

    public static void tsp(int current, int currentCost, int count) {
        if (count == n) {
            if (cost[current][0] > 0) {
                minCost = Math.min(minCost, currentCost + cost[current][0]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && cost[current][i] > 0) {
                visited[i] = true;
                tsp(i, currentCost + cost[current][i], count + 1);
                visited[i] = false;
            }
        }
    }
}