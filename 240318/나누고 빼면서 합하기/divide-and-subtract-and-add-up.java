import java.util.Scanner;

public class Main {
    public static int m; // 전역변수 m

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = operation(arr);
        System.out.print(res);
    }

    public static int operation(int[] arr) {
        int ans = arr[m-1];
        while(m > 1){
            if(m % 2 != 0)
                m -= 1;
            else m/=2;
            ans += arr[m-1];
        }
        return ans;
    }
}