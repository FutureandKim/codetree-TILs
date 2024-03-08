import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String resA = String.format("%.3f", a);
        String resB = String.format("%.3f", b);
        String resC = String.format("%.3f", c);

        System.out.printf("%s\n%s\n%s", resA, resB, resC);
    }
}