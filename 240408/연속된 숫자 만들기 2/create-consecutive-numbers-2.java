import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int cnt = 0;

        for(int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        // 1. 이동하지 않아도 되는 경우
        if(arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2])
            cnt = 0;
        // 2. (4, 6, 10) (1, 7, 9) 처럼 두 숫자가 2 차이나는 경우
        else if(arr[0] + 2 == arr[1] || arr[1] + 2 == arr[2])
            cnt = 1;
        // 3. 그 외
        else
            cnt = 2;

        System.out.print(cnt);
    }
}