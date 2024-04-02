import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < n; i++)
            height[i] = sc.nextInt();

        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-t; i++){
            int cost = 0;
            for(int j = i; j < i+t; j++)
                cost += Math.abs(height[j] - h);
            min = Math.min(cost, min);
        }
        System.out.print(min);
    }
}