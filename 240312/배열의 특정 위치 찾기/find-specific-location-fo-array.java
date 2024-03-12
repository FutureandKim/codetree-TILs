import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum_2 = 0, sum_3 = 0, cnt_3 = 0;

        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if((i+1) % 2 == 0)
                sum_2 += a[i];
            if((i+1) % 3 == 0){
                sum_3 += a[i];
                cnt_3++;
            }
        }
        System.out.printf("%d %.1f", sum_2, (double)sum_3/cnt_3);
    }
}