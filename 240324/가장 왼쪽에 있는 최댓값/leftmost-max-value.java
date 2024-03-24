import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1, idx = -1, cnt = 0;
        int[] idxArr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                idxArr[0] = i+1;
            }
        }
        
        while(true){
            if(idxArr[cnt] == 1)
                break;

            max = -1;
            idx = -1;
            cnt++;
            for(int i = 0; i < idxArr[cnt-1]-1; i++){
                if(arr[i] > max){
                    max = arr[i];
                    idxArr[cnt] = i+1; 
                }
            }
        }
        for(int i = 0; i <= cnt; i++)
            System.out.print(idxArr[i] + " ");
    }
}