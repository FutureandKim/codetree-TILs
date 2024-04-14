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
                if(arr[i] == 1){
                    wifi++;
                    for(int j = i; j < i+m*2+1; j++){
                        if(j < n)
                            arr[j] = 0;
                    }
                }
            }
        }
        System.out.print(wifi);
    }
}