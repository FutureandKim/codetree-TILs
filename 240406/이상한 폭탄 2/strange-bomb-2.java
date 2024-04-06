import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bomb = new int[n];
        int max = -1;

        for(int i = 0; i < n; i++)
            bomb[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            int start = i-k;
            int fin = i+k;
            if((i-k) < 0) start = 0;
            if((i+k) >= n) fin = n-1;

            for(int j = start; j <= fin; j++){
                if(i == j)
                    continue;
                else if(bomb[i] == bomb[j])
                    max = Math.max(max, bomb[i]);
            }
        }
        System.out.print(max);
    }
}