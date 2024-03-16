import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n, m);
    }

    // 최대공약수 구하는 함수
    public static void gcd(int n, int m) {
        int res = 1;

        // m 을 더 큰 수로 설정
        if(n > m){
            int temp = m;
            m = n;
            n = temp;
        } 
        
        for(int i = 1; i <= n; i++){
            if((n % i == 0) && (m % i == 0))
                res = i;
        }
        System.out.print(res);
    }

}