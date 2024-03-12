import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i < 10; i++)
            a[i] = sc.nextInt();

        for(int i = 1; i <= 6; i++){
            int cnt = 0;
            for(int j = 0; j < 10; j++){
                if(a[j] == i)
                    cnt++;
            }
            System.out.printf("%d - %d\n", i, cnt);
        }
    }
}