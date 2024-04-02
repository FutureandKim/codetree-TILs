import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[6];

        for(int i = 0; i < 6; i++)
            ab[i] = sc.nextInt();

        Arrays.sort(ab);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int sum1 = ab[0] + ab[5];
        int sum2 = ab[1] + ab[4];
        int sum3 = ab[2] + ab[3];

        min = Math.min(sum1, sum2);
        min = Math.min(min, sum3);

        max = Math.max(sum1, sum2);
        max = Math.max(max, sum3);
        int res = max - min;
        System.out.print(res);
    }
}