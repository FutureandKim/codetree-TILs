import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n]; // n개의 정수 배열
        int len = (n*(n-1))/2; // (n-2)개 정수합 개수(nC2)
        int[] sum = new int[len]; // (n-2)개 정수합 저장할 배열
        int allSum = 0, idx = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            allSum += arr[i];
        }

        // (n-2)개 정수합 == 전체 합 - (2개의 합)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++)
                sum[idx++] = allSum - (arr[i] + arr[j]);
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++)
            res = Math.min(res, Math.abs(s-sum[i]));
        System.out.print(res);
    }
}