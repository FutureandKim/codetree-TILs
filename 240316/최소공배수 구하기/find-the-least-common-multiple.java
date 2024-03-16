import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        lcm(n, m);
    }

    // 최소공배수 구하는 함수
    public static void lcm(int n, int m) {
        int idx = 1;
        
        // m을 더 큰 수로 설정
        if(n > m){
            int temp = m;
            m = n;
            n = temp;
        }

        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0){
                idx = i;
            }
        }

        int res = idx * (n/idx) * (m/idx);
        System.out.print(res);
    }
}