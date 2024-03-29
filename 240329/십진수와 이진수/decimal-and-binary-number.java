import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        BigInteger decimalNum = new BigInteger(n, 2);
        decimalNum = decimalNum.multiply(BigInteger.valueOf(17));
        String binary = decimalNum.toString(2);

        System.out.print(binary);
    }
}