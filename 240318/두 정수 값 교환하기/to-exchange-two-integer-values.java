import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        swap(a, b);
    }

    // swap 함수
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("%d %d", a, b);
    }
}