import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int minDis = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++)  
            num[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            int dis = 0;
            for(int j = 0; j < n; j++){
                int res = (j-i) * num[j];
                if(res < 0)
                    res = -res;
                dis += res;
            }
            minDis = Math.min(minDis, dis);
        }
        System.out.print(minDis);
    }
}