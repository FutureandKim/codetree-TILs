import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(isAns(n));
    }

    public static int isAns(int n){
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;
        return (isAns(n-1) * isAns(n-2)) % 100;
    }
}