import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] com = new int[1001];
        int res = Integer.MIN_VALUE;;

        for(int i = 0; i < n; i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            int b = sc.nextInt();

            for(int j = s; j <= t; j++){
                com[j] += b;
            }
        }

        for(int i = 0; i < 1001; i++)
            res = Math.max(res, com[i]);
        System.out.print(res);
    }
}