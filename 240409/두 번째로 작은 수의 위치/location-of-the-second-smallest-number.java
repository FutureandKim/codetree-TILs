import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] arr = new int[n];
        int loc = 0;
        int cntArr0 = 0, cntArr1 = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
            arr[i] = num[i];
        }
        
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(arr[1] == num[i]){
                loc = i+1;
                break;
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[0] == num[i])
                cntArr0++;
        }

        if(cntArr0 > 1)
            loc = -1;
        System.out.print(loc);
    }
}