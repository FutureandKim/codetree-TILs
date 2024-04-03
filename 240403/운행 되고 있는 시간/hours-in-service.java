import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] work = new int[n][2];
        int[] hour = new int[1001];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++)
                work[i][j] = sc.nextInt();
            // 개발자가 일하는 시간 동안 배열 값을 1씩 증가
            for (int j = work[i][0]; j < work[i][1]; j++) {
                hour[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // 해고된 개발자 시간 감소
            for (int j = work[i][0]; j < work[i][1]; j++)
                hour[j]--;
            int cnt = 0;
            for (int k = 1; k < 1001; k++) {
                if (hour[k] != 0)
                    cnt++;
            }
            max = Math.max(max, cnt);
            // 다시 원래 배열 상태로 되돌리기
            for (int j = work[i][0]; j < work[i][1]; j++)
                hour[j]++;
        }
        System.out.print(max);

    }
    
}