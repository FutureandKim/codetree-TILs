import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int i, sum = 0;

        for(i = 0; i < 10; i++){
            int res = a % b;
            a /= b;
            arr[i] = res;
            if(a <= 1)
                break;
        }

        for(int k = 0; k <= 9; k++){
            int cnt = 0;
            for(int j = 0; j <= i; j++){
                if(arr[j] == k)
                    cnt++;
            }
            sum += (cnt*cnt);
        }
        System.out.print(sum);
        sc.close();
    }
}