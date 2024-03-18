import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = absolute(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 절대값으로 변경해주는 함수
    public static int[] absolute(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
                arr[i] = -arr[i];
        }
        return arr;
    }
}