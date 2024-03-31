import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] partial = new int[m];
        int cnt = 0;

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        for(int i = 0; i < n-m+1; i++){
            int idx = 0;
            for(int j = i; j < i+m; j++)
                partial[idx++] = a[j];
            Arrays.sort(partial);

            for(int k = 0; k < m; k++){
                if(k < m-1 && partial[k] != b[k])
                    break;
                if(k == m-1 && partial[k] == b[k])
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}