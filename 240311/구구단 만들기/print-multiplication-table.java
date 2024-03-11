import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            for(int j = b; j >= a; j--){
                if(j % 2 == 0)
                    if(j == a || j == (a+1))
                        System.out.printf("%d * %d = %d", j, i, j*i);
                    else
                        System.out.printf("%d * %d = %d / ", j, i, j*i);
            }
            System.out.println();
        }
    }
}