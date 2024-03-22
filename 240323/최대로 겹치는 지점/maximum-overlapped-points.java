import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[100];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            for(int j = x1-1; j <= x2; j++)
                line[j] += 1;
        }

        int max = -1;
        for(int i = 0; i < 100; i++){
            if(line[i] > max)
                max = line[i];
        }
        System.out.print(max);
    }
}