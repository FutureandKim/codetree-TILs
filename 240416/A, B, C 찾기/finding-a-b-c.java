import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];
        int a = 0, b = 0, c = 0;

        for(int i = 0; i < 7; i++)
            num[i] = sc.nextInt();

        Arrays.sort(num);

        a = num[0];
        b = num[1];

        if(num[2] == a+b)
            c = num[3];
        else
            c = num[2];

        System.out.printf("%d %d %d", a, b, c);
    }
}