import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int i, sum = 0;

        for(i = 0; i < 10; i++){
            int res = a % b; // 배열에 저장할 값(나눗셈의 나머지)
            a /= b; // 나눗셈 반복
            arr[i] = res;
            if(a <= 1) // a가 1 이하가 되면 for문 중지
                break;
        }

        for(int k = 0; k <= 9; k++){
            int cnt = 0;
            for(int j = 0; j <= i; j++){
                if(arr[j] == k)
                    cnt++;
            }
            sum += (cnt*cnt);
        }
        System.out.print(sum);
        sc.close();
    }
}