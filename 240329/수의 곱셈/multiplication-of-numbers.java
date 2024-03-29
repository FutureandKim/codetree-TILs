import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] arr = new int[7];
        int[] odd = new int[7];
        int[] even = new int[7];
        int cnt1 = 0;

        arr[0] = n1 * n2 * n3;
        arr[1] = n1 * n2;
        arr[2] = n1 * n3;
        arr[3] = n2 * n3;
        arr[4] = n1;
        arr[5] = n2;
        arr[6] = n3;

        for(int i = 0; i < 7; i++){
            if(arr[i] % 2 == 0){
                even[i] = arr[i];
                cnt1++;
            }
        }

        for(int i = 0; i < 7; i++){
            if(arr[i] % 2 != 0)
                odd[i] = arr[i];
        }

        int res = odd[0];
        if(even[0] > res)
            res = even[0];
        System.out.print(res);
    }
}