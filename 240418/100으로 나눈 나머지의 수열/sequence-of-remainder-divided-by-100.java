import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = isAns(n);
        System.out.print(ans);
    }

    public static int isAns(int n){
        arr[0] = 2;
        arr[1] = 4;

        if(n == 1)
            return 2;
        if(n == 2)
            return 4;

        int idx = 2;
        while(idx < n){
            arr[idx] = (arr[idx-1] * arr[idx-2]) % 100;
            idx++;
        }
        return arr[n-1];
    }
}