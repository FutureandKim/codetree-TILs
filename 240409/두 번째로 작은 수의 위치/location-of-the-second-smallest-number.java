import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] arr = new int[n];
        int loc = 0, min2 = 0;
        int cntMin2 = 0;

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
            arr[i] = num[i];
        }
        
        Arrays.sort(arr);

        // 두번째로 작은 수 찾기
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[0]){
                min2 = arr[i];
                break;
            } 
            else if(i == n-1 && arr[0] == arr[i])
                min2 = arr[0];
        }

        for(int i = 0; i < n; i++){
            if(min2 == num[i]){
                loc = i+1;
                break;
            }
        }

        // 두번째로 작은수가 여러개라면 -1
        for(int i = 0; i < n; i++){
            if(min2 == num[i])
                cntMin2++;
        }
        if(cntMin2 > 1)
            loc = -1;

        System.out.print(loc);
    }
}