import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> arrHash = new HashMap<>();
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            String str = sc.next();
            
            if(arrHash.containsKey(str)){
                int strNum = arrHash.get(str);
                arrHash.put(str, strNum+1);
            } else {
                arrHash.put(str, 1);
            }

            max = Math.max(max, arrHash.get(str));
        }

        System.out.print(max);
    }
}