import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();

            if(str.equals("add")){
                int num = sc.nextInt();
                treeSet.add(num);
            } else if(str.equals("find")){
                int num = sc.nextInt();
                System.out.println(treeSet.contains(num));
            } else if(str.equals("lower_bound")){
                int num = sc.nextInt();
                System.out.println(treeSet.ceiling(num) == null ? "None" : treeSet.ceiling(num));
            } else if(str.equals("upper_bound")){
                int num = sc.nextInt();
                System.out.println(treeSet.higher(num) == null ? "None" : treeSet.higher(num));
            } else if(str.equals("remove")){
                int num = sc.nextInt();
                treeSet.remove(num);
            } else if(str.equals("largest")){
                System.out.println(!treeSet.isEmpty() ? treeSet.last() : "None");
            } else if(str.equals("smallest")){
                System.out.println(!treeSet.isEmpty() ? treeSet.first() : "None");
            }
        }

    }
}