import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hashNum = new HashMap<>();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            hashNum.put(arr[i], i+1);
        }

        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            int numCnt = hashNum.get(num) == null ? 0 : hashNum.get(num);
            System.out.print(numCnt + " ");
        }
    }
}