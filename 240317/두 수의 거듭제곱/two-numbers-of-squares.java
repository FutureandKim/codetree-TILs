import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = involution(a, b);
        System.out.print(res);
    }

    // a^b 계산하는 함수
    public static int involution(int a, int b) {
        int res = 1;
        for(int i = 1; i <= b; i++){
            res *= a;
        }
        return res;
    }
}