import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // 오름차순
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        // 내림차순
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[i]);
    }
}