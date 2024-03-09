import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_a = sc.nextInt();
        char sex_a = sc.next().charAt(0);
        int age_b = sc.nextInt();
        char sex_b = sc.next().charAt(0);

        if((age_a >= 19 && sex_a == 'M') || (age_b >= 19 && sex_b == 'M'))
            System.out.print(1);
        else
            System.out.print(0);
    }
}