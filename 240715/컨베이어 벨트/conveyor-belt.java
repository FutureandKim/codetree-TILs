import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] arr = new int[2][n];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        // 값 바꾸기
        arr = changeVal(arr, n);

        // t만큼 회전
        for(int i = 0; i < t; i++)
            arr = conveyor(arr, n);

        // 값 다시 바꾸기
        arr = changeVal(arr, n);

        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[0][i]);
        System.out.println();
        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[1][i]);

    }

    // arr[1][0], arr[1][n-1] 값 바꾸는 함수
    public static int[][] changeVal(int[][] arr, int n){
        int[][] arr2 = new int[2][n];

        for(int i = 0; i < n; i++)  
            arr2[0][i] = arr[0][i];

        for(int i = 0; i < n; i++)
            arr2[1][i] = arr[1][n-1-i];

        return arr2;
    }

    // 회전하는 함수
    public static int[][] conveyor(int[][] arr, int n){
        int[][] arr2 = new int[2][n];

        for(int i = 1; i < n; i++)
            arr2[0][i] = arr[0][i-1];
        for(int i = n-2; i >= 0; i--)
            arr2[1][i] = arr[1][i+1];

        arr2[0][0] = arr[1][0];
        arr2[1][n-1] = arr[0][n-1];

        return arr2;
    }
}