import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Integer.MAX_VALUE;

        // 1. 순간이동 안쓰기
        int len = Math.abs(b - a);
        min = Math.min(min, len);

        // 2. a → x → y → b
        len = Math.abs(a - x) + Math.abs(b - y);
        min = Math.min(min, len);

        // 3. a → y → x → b
        len = Math.abs(a - y) + Math.abs(x - b);
        min = Math.min(min, len);

        System.out.print(min);
    }
}