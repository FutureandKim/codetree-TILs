import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int mul = n1 * n2 * n3;

        System.out.print(digitSum(mul));
    }

    public static int digitSum(int n){
        int sum = 0;
        if(n == 0)
            return sum;
        return (n%10)+digitSum(n/10);
    }
}