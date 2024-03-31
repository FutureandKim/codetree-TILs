import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] dis = new int[n];

        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int cnt = 0;
            int hap = 0;
            for(int j = 0; j < n; j++){
                if(j-i < 0)
                    dis[i] += (num[j] * (n-i+j));
                else
                    dis[i] += (num[j] * (j-i));
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
            min = Math.min(dis[i], min);
        System.out.print(min);
    }
}