import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum1(n);
        System.out.println();
        printNum2(n);
    }

    public static void printNum1(int n) {
        if(n == 0)
            return;

        printNum1(n-1);
        System.out.printf("%d ", n);
    }

    public static void printNum2(int n) {
        if(n == 0)
            return;

        System.out.printf("%d ", n);
        printNum2(n-1);
    }
}