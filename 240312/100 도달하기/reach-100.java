import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[12];
        
        a[0] = 1;
        a[1] = n;

        System.out.printf("%d %d ", a[0], a[1]);

        for(int i = 2; i < 12; i++){
            a[i] = a[i-1] + a[i-2];
            if(a[i] > 100){
                System.out.print(a[i]);
                break;
            }
            System.out.printf("%d ", a[i]);
        }

    }
}