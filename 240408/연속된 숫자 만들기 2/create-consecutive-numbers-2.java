import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int cnt = 0;

        for(int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();

        if(arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2])
            cnt = 0;
        else if(arr[0] + 1 == arr[1] || arr[1] + 1 == arr[2])
            cnt = 2;
        else if(arr[1] - arr[0] <= arr[2] - arr[1]){
            while(arr[0] + 1 != arr[1] || arr[1] + 1 != arr[2]){
                arr[2] = arr[0] + 1;
                Arrays.sort(arr);
                cnt++;
            }
        }
        else if(arr[1] - arr[0] > arr[2] - arr[1]){
            while(arr[0] + 1 != arr[1] || arr[1] + 1 != arr[2]){
                arr[0] = arr[1] + 1;
                Arrays.sort(arr);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}