import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-k+1; i++){
            int hap = 0;
            for(int j = i; j < i+k; j++)
                hap += arr[j];
            max = Math.max(hap, max);
        }
        System.out.print(max);
    }
}