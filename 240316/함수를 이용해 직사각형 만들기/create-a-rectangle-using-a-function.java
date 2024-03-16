import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        rectangle(n, m);
    }

    // 직사각형 출력 함수
    public static void rectangle(int n, int m) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(1);
            System.out.println();
        }
    }
}