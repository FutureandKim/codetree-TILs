import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] big = new int[10];
        int[] small = new int [10];
        int cnt_b = 0, cnt_s = 0;

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n > 500){
                big[cnt_b] = n;
                cnt_b++;
            }
            if(n < 500){
                small[cnt_s] = n;
                cnt_s++;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < cnt_s; i++){
            if(small[i] > max)
                max = small[i];
        }

        for(int i = 0; i < cnt_b; i++){
            if(big[i] < min)
                min = big[i];
        }
        System.out.printf("%d %d", max, min);
        sc.close();
    }
}