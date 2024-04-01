import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] loc = new int[401];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int candy = sc.nextInt();
            int bLoc = sc.nextInt() + 200;
            loc[bLoc] += candy;
        }

        for(int i = 200; i < 401-k; i++){
            int cnt = 0;
            for(int j = i-k; j <= i+k; j++)
                cnt += loc[j];
            max = Math.max(cnt, max);
        }
        System.out.print(max);
    }
}