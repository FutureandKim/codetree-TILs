import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;

        int bomb = grid[r][c];

        for(int i = 0; i < bomb; i++){
            if(r-i >= 0)
                grid[r-i][c] = 0;
            if(r+i < n)
                grid[r+i][c] = 0;
            if(c-i >= 0)
                grid[r][c-i] = 0;
            if(c+i < n)
                grid[r][c+i] = 0;
        }

        //중력 적용
        for(int i = 0; i < n; i++){
            int empty = n-1;

            for(int j = n-1; j >= 0; j--){
                if(grid[j][i] != 0){
                    grid[empty][i] = grid[j][i];
                    if(empty != j){
                        grid[j][i] = 0;
                    }
                    empty--;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}