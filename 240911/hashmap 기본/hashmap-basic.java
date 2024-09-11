import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> m = new HashMap<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String s = sc.next();

            if(s.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                m.put(k, v);
            } 
            else if(s.equals("find")) {
                int num = sc.nextInt();
            
                if(m.containsKey(num)){
                    System.out.println(m.get(num));
                }
                else {
                    System.out.println("None");
                }
            } 
            else if(s.equals("remove")) {
                int num = sc.nextInt();

                if(m.containsKey(num)){
                    m.remove(num);
                } 
                else {
                    System.out.println("None");
                }
            }
        }
    }
}