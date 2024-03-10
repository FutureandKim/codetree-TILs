import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;

        while(n <= b){
            System.out.printf("%d ", n);

            if(n % 2 == 1)
                n *= 2;
            else
                n += 3;
        }
    }
}