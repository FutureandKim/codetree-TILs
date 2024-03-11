import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 11; j < 2*n+11; j+=2)
                System.out.printf("%d ", 2*i+j);
            System.out.println();
        }
    }
}