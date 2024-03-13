import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = sc.nextInt();
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;

        // 최대값 찾기 위한 for문
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                arr[i] = arr[0]; // 최대값과 arr[0] 위치 바꿈
                arr[0] = max; 
            }
        }

        // arr[0]은 최대값이므로 
        // arr[1]부터 for문 진행하여 두번째로 큰 수 찾기
        for(int i = 1; i < n; i++){
            if(arr[i] > max2)
                max2 = arr[i];
        }
        System.out.printf("%d %d", max, max2);

    }
}