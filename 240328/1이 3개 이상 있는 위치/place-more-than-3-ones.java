import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int isOne = 0;
            for(int j = 0; j < n; j++){
                if(i > 0 && grid[i-1][j] == 1)
                    isOne++;
                if(i < n-1 && grid[i+1][j] == 1)
                    isOne++;
                if(j > 0 && grid[i][j-1] == 1)
                    isOne++;
                if(j < n-1 &&  grid[i][j+1] == 1)
                    isOne++;
            }
            if(isOne >= 3)
                cnt++;
        }
        System.out.print(cnt);
    }
}