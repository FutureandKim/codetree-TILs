import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int dis = 0;
            for(int j = 0; j < n; j++){
                if(j-i < 0)
                    dis += (num[j] * (n-i+j));
                else
                    dis += (num[j] * (j-i));
            }
            min = Math.min(dis, min);
        }
        System.out.print(min);
    }
}