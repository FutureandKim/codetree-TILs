import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num > 0) 
                arr[i] = 1;
            else 
                arr[i] = -1;
        }

        int cnt = 1;
        int max = -1;
        for(int i = 1; i < n; i++){
            if(arr[i-1] == arr[i])
                cnt++;
            else if(arr[i-1] != arr[i]){
                if(cnt > max)
                    max = cnt;
                cnt = 1;
            }
            
            if(i == n-1){
                if(cnt > max)
                    max = cnt;
            }
        }
        System.out.print(max);
    }
}