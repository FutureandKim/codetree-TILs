import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] work = new int[n][2];
        int[] hour = new int[1001];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                work[i][j] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int start = work[i][0];
            int finish = work[i][1];
            for(int j = start; j < finish; j++)
                hour[j]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int start = work[i][0];
            int finish = work[i][1];
            for(int j = start; j < finish; j++){
                hour[j]--;
                int cnt = 0;
                for(int k = 0; k < 1001; k++){
                    if(hour[k] != 0)
                        cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        System.out.print(max-1);
    }
}