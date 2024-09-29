import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> intHash = new HashMap<>();

        int cnt = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            
            if(intHash.containsKey(k-num)){
                cnt += intHash.get(k-num);
            }

            intHash.put(num, intHash.getOrDefault(num, 0)+1);
        }
        System.out.print(cnt);
    }
}