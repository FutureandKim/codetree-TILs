import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum_odd = 0, sum_even = 0;

        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if((i+1) % 2 != 0)
                sum_odd += a[i];
            else
                sum_even += a[i];
        }

        if(sum_odd > sum_even)
            System.out.print(sum_odd-sum_even);
        else
            System.out.print(sum_even-sum_odd);
        sc.close();
    }
}