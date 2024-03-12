import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, cnt = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            if(a % 2 == 0){
                arr[cnt] = a;
                cnt++;   
            }
        }

        for(int i = 0; i <= cnt-1; i++)
            System.out.printf("%d ", arr[(cnt-1)-i]);
    }
}