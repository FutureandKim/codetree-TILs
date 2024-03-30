import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        int len = (n*(n-1))/2;
        int[] sum = new int[len];
        int allSum = 0, cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            allSum += arr[i];
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++)
                sum[cnt++] = allSum - (arr[i] + arr[j]);
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++)
            res = Math.min(res, Math.abs(s-sum[i]));
        System.out.print(res);
    }
}