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
            if(n == 1){
                max = arr[0];
                break;
            }
            else{
                for(int j = i+1; j < n; j++){
                    if(arr[j] - arr[i] > 0 && arr[j] - arr[i] > max)
                        max = arr[j] - arr[i];
                }
            }
        }
        System.out.print(max);
        sc.close();
    }
}