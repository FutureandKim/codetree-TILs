import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> intHash = new HashMap<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            intHash.put(num, intHash.getOrDefault(num, 1) + 1);
        }

        List<Map.Entry<Integer, Integer>> resList = new ArrayList<>(intHash.entrySet());

        resList.sort((a, b) -> {
            if(!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue();
            } else {
                return b.getKey() - a.getKey();
            }
        });

        for(int i = 0; i < k; i++){
            System.out.print(resList.get(i).getKey() + " ");
        }

    }
}