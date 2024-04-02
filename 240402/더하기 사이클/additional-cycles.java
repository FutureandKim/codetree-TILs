import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originN = n, cnt = 0;

        while(true){
            int num1 = (n % 10) + (n / 10);
            n = (num1 % 10) + ((n % 10) * 10);
            cnt ++;

            if(n == originN)
                break;
        }
        System.out.print(cnt);
    }
}