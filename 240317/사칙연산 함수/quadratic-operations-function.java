import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        int res;

        if(c == '+')
            System.out.printf("%d %c %d = %d", a, c, b, add(a, b));
        else if(c == '-') 
            System.out.printf("%d %c %d = %d", a, c, b, sub(a, b));
        else if(c == '*') 
            System.out.printf("%d %c %d = %d", a, c, b, mul(a, b));
        else if(c == '/') 
            System.out.printf("%d %c %d = %d", a, c, b, div(a, b));
        else System.out.print("False");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}