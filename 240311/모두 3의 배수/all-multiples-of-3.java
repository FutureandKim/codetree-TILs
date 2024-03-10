import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean res = false;

        for(int i = 0; i < 5; i++){
            n = sc.nextInt();
            if(n % 3 != 0)
                res = true;
        }

        if(res == true)
            System.out.print(0);
        else
            System.out.print(1);
    }
}