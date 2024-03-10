import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0, res = 1;
        
        while (n < b){
            res *= a;
            n += 1;
        }
        System.out.print(res);

    }
}