import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                double avg = 0;
                for(int k = i; k <= j; k++){
                    avg += arr[k];
                }
                avg = avg / (j - i + 1);
                
                for(int k = i; k <= j; k++){
                    if(avg == arr[k]){
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}