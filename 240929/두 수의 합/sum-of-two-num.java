import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> intHash = new HashMap<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            intHash.put(i, num);
        }

        System.out.print(nC2(intHash, k));

    }

    public static <K, V> int nC2(HashMap<Integer, Integer> intHash, int k) {
        int cnt = 0;
        for(int i = 0; i < intHash.size(); i++){
            for(int j = i+1; j < intHash.size(); j++){
                int res1 = intHash.get(i);
                int res2 = intHash.get(j);
                if(k == (res1+res2)) cnt++;
            }
        }
        return cnt;
    }
}