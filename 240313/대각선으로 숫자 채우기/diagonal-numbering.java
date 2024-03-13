import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int cnt = 1, num = 0;

        for(int k = 0; k <= m+n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(k == (i+j))
                        a[i][j] = cnt++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }
}