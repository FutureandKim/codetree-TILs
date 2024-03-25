import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num > 0) 
                arr[i] = 1;
            else 
                arr[i] = -1;
        }

        int cnt = 0;
        int[] cont = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0 || arr[i-1] != arr[i]){
                cont[i] = cnt;
                cnt = 0;
            }
            cnt++;
        }
        
        int max = 0;
        for(int i = 0; i < n; i++){
            if(cont[i] > max)
                max = cont[i];
        }
        System.out.print(max);
    }
}