import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr = new int[101]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        while(cnt < m){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            System.out.println(sumA1toA2(a1, a2));
            cnt++;
        }

    }
    
    // 구간의 합 구하는 함수
    public static int sumA1toA2(int a1, int a2){
        int sum = 0;
        for(int i = a1-1; i < a2; i++)
            sum += arr[i];
        return sum;
    }
}