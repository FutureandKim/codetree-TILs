import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sumAndDivide(n);
        System.out.print(res);
    }

    // 10으로 나눈 값 출력 함수
    public static int sumAndDivide(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        
        return sum/10;
    }
}