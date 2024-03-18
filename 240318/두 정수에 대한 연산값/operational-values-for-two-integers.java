import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[]{ a, b }; // a, b 정수 배열로 저장
        arr = operation(arr);

        System.out.print(arr[0] + " " + arr[1]);
    }

    // 두 정수에 대한 연산을 수행하는 함수
    public static int[] operation(int[] arr) {
        if(arr[0] > arr[1]){
            arr[0] += 25;
            arr[1] *= 2;
        } else{
            arr[0] *= 2;
            arr[1] += 25;
        }
        return arr;
    }
}