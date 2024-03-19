import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int[] group = new int[n]; // 원소의 합 배열

        for(int i = 0; i < 2*n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        // 정렬된 arr의 양 끝 값 그룹지어서 합해줌
        for(int i = 0; i < n; i++)
            group[i] = arr[i] + arr[(2*n)-1-i];

        Arrays.sort(group);
        System.out.print(group[n-1]); // group에서 가장 큰 값 출력
    }
}