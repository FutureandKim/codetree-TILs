import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = new int[n];

        for(int i = 0; i < n; i++)
            h[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= 1000; i++)
            max = Math.max(max, numOfIceberg(i));
        System.out.print(max);
    }

    // 빙산의 개수를 출력하는 함수
    public static int numOfIceberg(int k){
        int num = 0;

        for(int i = 1; i < n; i++){
            if(h[i-1] > k && h[i] <= k)
                num++;
        }
        if(h[n-1] > k && h[n-2] <= k)
            num++;
            
        return num;
    }
}