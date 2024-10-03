import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            treeMap.put(str, treeMap.getOrDefault(str, 0)+1);
        }

        Iterator<Entry<String, Integer>> it = treeMap.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            double ratio = (entry.getValue() / (double)n) * 100;
            System.out.printf("%s %.4f\n", entry.getKey(), ratio);
        }
    }
}