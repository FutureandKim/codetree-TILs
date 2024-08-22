import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];

        int[] p = new int[n];
        int[] s = new int[n];

        // 가격, 배송비 입력
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int cnt = 0;
            int price = 0;
            for(int j = 0; j < n; j++){
                if(j == i)
                    price += ((p[j]/2) + s[j]);
                else price += (p[j] + s[j]);

                if(price > b){
                    arr[i] = cnt;
                    break;
                }
                
                cnt++;
            }
        }

        Arrays.sort(arr);
        System.out.print(arr[n-1]);
    }
}