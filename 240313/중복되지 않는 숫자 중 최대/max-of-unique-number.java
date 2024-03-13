import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[1001];
        int max = -1;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    cnt[arr[i]] += 1;
                }
            }
            //System.out.printf("%d ", arr[i]);
        }

        for(int i = 0; i < n; i++){
            if(cnt[arr[i]] == 0 && arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
        sc.close();        
    }
}