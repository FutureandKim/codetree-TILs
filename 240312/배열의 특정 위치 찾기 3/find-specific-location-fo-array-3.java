import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];

        for(int i = 0; i < 100; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                System.out.printf("%d", a[i-3]+a[i-2]+a[i-1]);
                break;
            }
        }
    }
}