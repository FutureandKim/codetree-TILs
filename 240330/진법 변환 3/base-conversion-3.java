import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        BigInteger dec = new BigInteger(n, 8);
        String bin = dec.toString(2);
        System.out.print(bin);
    }
}