import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for(int i = 1; i < 10; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(a[j] == i)
                    cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}