import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isCount(i))
                cnt++;
        }
        System.out.print(cnt);
    }

    public static boolean isCount(int n){
        // 소수 판별
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }

        // 자리수의 합 판별
        int div = 0;
        while(n > 0){
            int rest = n % 10;
            div += rest;
            n /= 10;
        }

        if(div % 2 != 0)
            return false;

        return true;
    }
}