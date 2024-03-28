import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(hap(n));
        
    }
    
    public static int hap(int n) {
        if(n == 1 || n == 2)
            return n;
        return hap(n-2) + n;
    }
}