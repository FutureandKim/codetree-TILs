import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = square(n);
        System.out.print(res);
    }

    public static int square(int n){
        if(n < 10)
            return n*n;
        return square(n/10) + (n%10) * (n%10);
    }
}