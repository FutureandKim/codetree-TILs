import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i <= 100; i++){
            if(i >= 90)
                System.out.printf("%c ", 'A');
            else if(i >= 80)
                System.out.printf("%c ", 'B');
            else if(i >= 70)
                System.out.printf("%c ", 'C');
            else if(i >= 60)
                System.out.printf("%c ", 'D');
            else
                System.out.printf("%c ", 'F');
        }
    }
}