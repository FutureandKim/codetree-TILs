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
            int idx = 0, same = 1;
            while(idx < n-1){
                if(arr[i][idx] == arr[i][idx+1])
                    same++;
                idx++;
            }
            if(same >= m)
                cnt++;
        }

        // 열에서 행복한 수열 찾기
        for(int j = 0; j < n; j++){
            int idx = 0, same = 1;
            while(idx < n-1){
                if(arr[idx][j] == arr[idx+1][j])
                    same++;
                idx++;
            }
            if(same >= m)
                cnt++;
        }
        System.out.print(cnt);
    }
}