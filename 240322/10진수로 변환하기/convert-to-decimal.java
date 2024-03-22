import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int a = n;
        
        // n이 몇자리 수인지
        while(true) {
            if(a < 10) {
                cnt++;
                break;
            }
            a /= 10;
            cnt++;
        }

        int[] digit = new int[cnt];

        // n의 각 자리수 digit배열에 저장
        for(int i = cnt-1; i >= 0; i--){
            digit[i] = (n%10);
            n /= 10;
        }

        int res = 0;
        for(int i = 0; i < cnt; i++)
            res = res * 2 + digit[i];

        System.out.print(res);
    }
}