import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] - arr[i] > max)
                    max = arr[j] - arr[i];
            }
        }
        if(max <= 0)
            System.out.print(0);
        else
            System.out.print(max);

        sc.close();
    }
}