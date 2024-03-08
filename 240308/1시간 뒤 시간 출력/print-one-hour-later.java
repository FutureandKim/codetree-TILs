import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = sc.nextInt() + 1;
        int m = sc.nextInt();

        System.out.printf("%d:%d", h, m);

    }
}