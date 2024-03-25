import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int idx = 0, less = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            // t보다 큰 값만 배열에 저장
            if(num > t){ 
                arr[idx] = num;
                idx++;
            } else{
                less++;
            }
        }

        int cnt = 1;
        int max = 0;
        for(int i = 1; i <= idx; i++){
            if(arr[i] > arr[i-1])
                cnt++;
            else if(arr[i] <= arr[i-1]){
                if(cnt > max)
                    max = cnt;
                cnt = 1;
            }
        }
        if(less == n)
            max = 0;
        System.out.print(max);
    }
}