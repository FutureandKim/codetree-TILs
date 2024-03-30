import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coin = new int[n][n];
        int maxCoin = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                coin[i][j] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 2; j++){
                maxCoin = Math.max(maxCoin, coin[i][j] + coin[i][j+1] + coin[i][j+2]);
            }
        }
        System.out.print(maxCoin);
    }
}