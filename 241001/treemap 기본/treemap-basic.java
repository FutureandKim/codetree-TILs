import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();

            if(str.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                treeMap.put(k, v);
            } else if(str.equals("remove")) {
                int k = sc.nextInt();
                treeMap.remove(k);
            } else if(str.equals("print_list")) {
                if(treeMap.size() == 0){
                    System.out.println("None");
                    break;
                }
                Iterator<Entry<Integer, Integer>> it = treeMap.entrySet().iterator();
                while(it.hasNext()){
                    Entry<Integer, Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                }
                System.out.println();
            } else if(str.equals("find")){
                int k = sc.nextInt();
                if(treeMap.containsKey(k))
                    System.out.println(treeMap.get(k));
                else
                    System.out.println("None");
            }
        }
    }
}