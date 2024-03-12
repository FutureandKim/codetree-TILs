import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0, cnt = 0;

        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if(i % 2 != 0){
                sum += a[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}