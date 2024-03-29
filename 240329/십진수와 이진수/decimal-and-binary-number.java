import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int decimalNum = Integer.parseInt(n, 2);
        decimalNum *= 17;
        String binary = Integer.toString(decimalNum, 2);
        System.out.print(binary);
    }
}