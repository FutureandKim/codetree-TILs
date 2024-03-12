import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0, arr_num; // 2의 개수 카운트, 3번째 2 위치 

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 2){
                cnt++;
                if(cnt == 3)
                    arr_num = i;
            }
        }
        System.out.print(arr_num);
    }
}