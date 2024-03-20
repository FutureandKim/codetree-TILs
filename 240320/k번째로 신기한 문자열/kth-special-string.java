import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.startsWith(t)){
                arr[cnt] = str;
                cnt++;
            }
        }

        Arrays.sort(arr, 0, cnt);
        System.out.print(arr[k-1]);
    }
}