import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursiveFun(n);
    }

    // 재귀함수
    public static void recursiveFun(int n) {
        if(n == 0)
            return;
        
        System.out.printf("%d ", n);
        recursiveFun(n-1);
        System.out.printf("%d ", n);

    }
}