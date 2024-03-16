import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isMultipleFive(n))
            System.out.print("Yes");
        else{
            System.out.print("No");
        }
    }

    // 각 자리수의 합이 5의 배수이면서
    // 짝수인지 확인하는 함수
    public static boolean isMultipleFive(int n) {
        int res = (n/10) + (n%10);
        return res % 5 == 0 && res % 2 == 0;
    }
}