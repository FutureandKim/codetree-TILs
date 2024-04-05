import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++)
                System.out.print("  ");
            for(int j = cnt; j >= 1; j--)
                System.out.print(j + " ");
            cnt--;
            System.out.println();
        }
    }
}