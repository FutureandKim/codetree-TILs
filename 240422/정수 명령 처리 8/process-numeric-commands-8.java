import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Integer> list = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            processOrder(str);
        }
    }

    public static void processOrder(String str){
        if(str.equals("push_front")){
            int a = sc.nextInt();
            list.addFirst(a);
        }
        else if(str.equals("push_back")){
            int a = sc.nextInt();
            list.addLast(a);
        }
        else if(str.equals("pop_front"))
            System.out.println(list.pollFirst());
        else if(str.equals("pop_back"))
            System.out.println(list.pollLast());
        else if(str.equals("size"))
            System.out.println(list.size());
        else if(str.equals("empty"))
            System.out.println(list.isEmpty() ? 1 : 0);
        else if(str.equals("front"))
            System.out.println(list.peekFirst());
        else if(str.equals("back"))
            System.out.println(list.peekLast());
    }
}