import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] blockNum = new int[n];
        int num = 1;

        for(int i = 0; i < k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a-1; j < b; j++)
                blockNum[j] += 1;
        }

        int max = -1;
        for(int i = 0; i < n; i++){
            if(blockNum[i] > max)
                max = blockNum[i];
        }
        System.out.print(max);
    }
}