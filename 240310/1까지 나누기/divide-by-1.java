import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        while(n > 1){
            n /= cnt;
            cnt++;
        }

        System.out.print(cnt-1);
    }
}