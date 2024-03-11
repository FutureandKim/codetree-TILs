import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n*n; i++){
            if(i % 3 == 0)
                System.out.printf("%c\n", (char)(i+64));
            else
                System.out.print((char)(i+64));
        }
    }
}