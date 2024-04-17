import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        // 행에서 행복한 수열 찾기
        for(int i = 0; i < n; i++){
            int same = 1;
            for(int j = 0; j < n-1; j ++){
                if(arr[i][j] == arr[i][j+1])
                    same += 1;
                else
                    same = 1;
                if(same >= m){
                    cnt++;
                    break;
                }
            }
        }

        // 열에서 행복한 수열 찾기
        for(int j = 0; j < n; j++){
            int same = 1;
            for(int i = 0; i < n-1; i++){
                if(arr[i][j] == arr[i+1][j])
                    same += 1;
                else
                    same = 1;
                if(same >= m){
                    cnt++;
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}