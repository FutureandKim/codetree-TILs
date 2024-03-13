import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = sc.nextInt();
        int max = arr[0];
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                arr[i] = arr[0];
                arr[0] = max;
            }
        }

        int max2 = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            if(arr[i] > max2)
                max2 = arr[i];
        }
        System.out.printf("%d %d", max, max2);

    }
}