import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int dec = Integer.parseInt(n, 8);
        String bin = Integer.toString(dec, 2);
        System.out.print(bin);
    }
}