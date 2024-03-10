import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = false;

        for(int i = 1; i < n; i++){
            if(i == 1)
                continue;

            if(n % i == 0)
                res = true;
        }

        if(res == true)
            System.out.print('C');
        else
            System.out.print('P');
    }
}