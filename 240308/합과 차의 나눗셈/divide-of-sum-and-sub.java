import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double res = (a+b) / (a-b);
        System.out.printf("%.2f", res);
    }
}