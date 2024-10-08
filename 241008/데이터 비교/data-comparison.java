import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i = 0; i < n; i++){
            hs1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
           arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            if(hs1.contains(arr[i])){
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}