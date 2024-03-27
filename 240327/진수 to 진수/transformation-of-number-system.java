import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        // a진수 n을 10진수로 변환
        int num = Integer.parseInt(n, a);

        // 10진수 num을 b진수로 변환
        System.out.print(Integer.toString(num, b));
    }
}