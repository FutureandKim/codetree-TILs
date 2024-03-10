import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;

        System.out.print(a + " ");
        while(n < b){
            if(n % 2 == 1)
                n *= 2;
            else
                n += 3;

            if(n > b)
                System.out.print("");
            else
                System.out.printf("%d ", n);

        }
    }
}