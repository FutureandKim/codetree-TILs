import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < n-2; j++){
                int cnt = 0;

                for(int k = i; k < i+3; k++){
                    for(int z = j; z < j+3; z++){
                        if(arr[k][z] == 1)
                            cnt++;
                    }
                }
                max = Math.max(cnt, max);
            }
        }
        System.out.print(max);
    }
}