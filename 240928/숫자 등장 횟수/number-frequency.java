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
            if(hashNum.containsKey(arr[i])){
                int numCnt = hashNum.get(arr[i]);
                hashNum.put(arr[i], numCnt+1);
            } else {
                hashNum.put(arr[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            if(hashNum.containsKey(num)){
                System.out.print(hashNum.get(num) + " ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}