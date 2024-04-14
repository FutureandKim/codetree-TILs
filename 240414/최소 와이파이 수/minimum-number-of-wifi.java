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

        if(m == 0){
            int cnt = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] == 1)
                    cnt++;
            }
            wifi = cnt;
        }
        else{
            for(int i = 0; i < n; i++){
                if(arr[i] == 1)
                    cntLeft++;

                if(cntLeft == m){
                    wifi++;
                    cntLeft = 0;
                    for(int j = i; j <= m+i+1; j++){
                        if(j < n)
                            arr[j] = 0;
                    }
                }
                if(i == n-1 && arr[i] == 1)
                    wifi += 1;
            }
        }

        System.out.print(wifi);
    }
}