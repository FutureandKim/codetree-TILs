import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int wifi = 0, cntLeft = 0;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(arr[i] == 1)
                cntLeft++;
            if(cntLeft == m+1){
                wifi++;
                cntLeft = 0;
                for(int j = i; j < m+i; j++)
                    arr[j] = 0;
            }
            else if(cntLeft == n-1 && wifi == 0)
                wifi = 1;
        }

        for(int i = 0; i < n; i++){
            if(arr[i] == 1)
                break;
            else if(arr[n-1] == 0)
                wifi = 0;
        }
        System.out.print(wifi);
    }
}