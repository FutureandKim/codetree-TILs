import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hap = 0;

        for(int i = n; i <= 500; i++){
            if(i % 2 == 0)
                hap += i;
        }
        System.out.print(hap);
    }
}