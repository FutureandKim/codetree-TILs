import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= 100; i++){
            int res = isEqualDiffer(i);
            max = Math.max(res, max);
        }

        System.out.print(max);
    }

    // 등차수열을 이루는 횟수를 반환하는 함수
    public static int isEqualDiffer(int k){
        int cnt = 0;

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if((arr[i] + arr[j]) == 2 * k)
                
                //if((k - arr[i]) == (arr[j] - k))
                    cnt++;
            }
        }
        return cnt;
    }
}