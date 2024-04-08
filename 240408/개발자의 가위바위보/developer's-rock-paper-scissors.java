import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][2];
        int cnt = 0, max = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                res[i][j] = sc.nextInt();
        }

        // 1. 1-가위 2-바위 3-보
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 3) || (res[i][0] == 2 && res[i][1] == 1) || (res[i][0] == 3 && res[i][1] == 2))
                cnt++;
        }
        max = Math.max(cnt, max);
        cnt = 0;

        // 2. 1-가위 2-보 3-바위
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 2) || (res[i][0] == 2 && res[i][1] == 3) || (res[i][0] == 3 && res[i][1] == 1))
                cnt++;
        }
        max = Math.max(cnt, max);
        cnt = 0;

        // 3. 1-바위 2-가위 3-보
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 2) || (res[i][0] == 2 && res[i][1] == 3) || (res[i][0] == 3 && res[i][1] == 1))
                cnt++;
        }
        max = Math.max(cnt, max);
        cnt = 0;

        // 4. 1-바위 2-보 3-가위
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 3) || (res[i][0] == 2 && res[i][1] == 1) || (res[i][0] == 3 && res[i][1] == 1))
                cnt++;
        }
        max = Math.max(cnt, max);
        cnt = 0;

        // 5. 1-보 2-가위 3-바위
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 3) || (res[i][0] == 2 && res[i][1] == 1) || (res[i][0] == 3 && res[i][1] == 2))
                cnt++;
        }
        max = Math.max(cnt, max);
        cnt = 0;

        // 6. 1-보 2-바위 3-가위
        for(int i = 0; i < n; i++){
            if((res[i][0] == 1 && res[i][1] == 2) || (res[i][0] == 2 && res[i][1] == 3) || (res[i][0] == 3 && res[i][1] == 1))
                cnt++;
        }
        max = Math.max(cnt, max);

        System.out.print(max);
    }
}