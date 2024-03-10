import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, a;

        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            if((a % 2 != 0) & (a % 3 == 0))
                sum += a;
        }
        System.out.print(sum);
    }
}