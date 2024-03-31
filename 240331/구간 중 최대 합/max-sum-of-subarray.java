import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int hap, max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-2; i++){
            hap = arr[i] + arr[i+1] + arr[i+2];
            max = Math.max(hap, max);
        }
        System.out.print(max);
    }
}