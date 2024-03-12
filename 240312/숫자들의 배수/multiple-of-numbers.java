import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10];
        int i, cnt = 0;

        for(i = 0; i < 10; i++){
            a[i] = n * (i+1);
            if(a[i] % 5 == 0){
                if(cnt == 2)
                    break;
                cnt++;
            }
        }

        for(int j = 0; j < i; j++)
            System.out.printf("%d ", a[j]);

        sc.close();
    }
}