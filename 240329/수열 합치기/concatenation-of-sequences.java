import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int len = n + m;
        int[] arr = new int[len];

        for(int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        
        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
    }
}