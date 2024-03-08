import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String first = sc.next();
        String middle = sc.next();
        String end = sc.next();

        System.out.printf("%s-%s-%s", first, end, middle);
    }
}