import java.util.Scanner;

public class Main {
    
    public static int n;
    public static int m;
    public static int[] comb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        comb = new int[m];

        selectNumbers(1, 0);
    }

    public static void selectNumbers(int start, int depth){
        if(depth == m){
            for(int i = 0; i < m; i++){
                System.out.print(comb[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= n; i++){
            comb[depth] = i;
            selectNumbers(i+1, depth+1);
        }
    }
}