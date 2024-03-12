import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = new char[10];

        for(int i = 0; i < 10; i++)
            c[i] = sc.next().charAt(0);

        System.out.printf("%c %c %c", c[1], c[4], c[7]);
        sc.close();
    }
}