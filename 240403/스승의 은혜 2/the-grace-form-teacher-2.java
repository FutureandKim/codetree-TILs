import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int p[];
    public static boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        p = new int[n];
        visited = new boolean[n];


        for(int i = 0; i < n; i++)
            p[i] = sc.nextInt();
        
        Arrays.sort(p);

        for(int i = 1; i <= n; i++){
            comb(0, n, i);
        }

    }

    static void comb(int start, int n, int r) {
        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i])
                    System.out.print(p[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i < n; i++){
            visited[i] = true;
            comb(i+1, n, r-1);
            visited[i] = false;
        }
    }
}