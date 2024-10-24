import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            int k = sc.nextInt();

            for(int j = 0; j < k; j++) {
                String str = sc.next();

                if(str.equals("I")){
                    int n = sc.nextInt();
                    treeSet.add(n);
                } else if(str.equals("D")){
                    int n = sc.nextInt();
                    if(!treeSet.isEmpty()){
                        if(n == 1){
                            int max = treeSet.last();
                            treeSet.remove(max);
                        } else {
                            int min = treeSet.first();
                            treeSet.remove(min);
                        }
                    }
                }
            }
            
            if(treeSet.size() > 0){
                System.out.println(treeSet.last() + " " + treeSet.first());
            } else {
                System.out.println("EMPTY");
            }
        }
    }
}