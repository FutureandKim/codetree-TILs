import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i;

        for(i = 0; i < 100; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0)
                break;
        }

        for(int j = 0; j < i; j++){
            if(a[j] % 2 != 0)
                System.out.printf("%d ", a[j]+3);
            else
                System.out.printf("%d ", a[j]/2);
        }

        sc.close();
    }
}