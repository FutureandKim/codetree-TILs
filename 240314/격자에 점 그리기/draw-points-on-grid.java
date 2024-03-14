import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;

        // 점 입력
        for(int i = 0; i < m; i++){
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            arr[r][c] = cnt++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.printf("%d ", arr[i][j]);
            System.out.println();
        }

        sc.close();
    }
}