import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, avg = 0, cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        avg = sum / n;
        Arrays.sort(arr);

        while(true){
            if(arr[0] == arr[n-1])
                break;
            int num = Math.min(arr[n-1]-avg, avg-arr[0]);
            arr[0] = arr[0] + num;
            arr[n-1] = arr[n-1] - num;
            cnt += num;
            Arrays.sort(arr);
        }
        System.out.print(cnt);
    }
}