import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] numbers;
    static int maxResult = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        xor(0, 0, 0);
        
        System.out.println(maxResult);
    }

    public static void xor(int start, int depth, int currentXOR) {
        if (depth == m) {
            maxResult = Math.max(maxResult, currentXOR);
            return;
        }
        
        for (int i = start; i < n; i++) {
            xor(i + 1, depth + 1, currentXOR ^ numbers[i]);
        }
    }
}