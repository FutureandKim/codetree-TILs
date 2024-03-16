import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = minimum(a, b, c);
        System.out.print(min);
    }

    // 최소값 구하는 함수
    public static int minimum(int a, int b, int c) {
        int res = Math.min(a, b);
        res = Math.min(res, c);

        return res;
    }
}