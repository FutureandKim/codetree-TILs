import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static LinkedList<Integer> l = new LinkedList<>();

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            ListOrder(str);
        }
    }

    public static void ListOrder(String str){
        if(str.equals("push_front")){
            int n = sc.nextInt();
            l.addFirst(n);
        }
        else if(str.equals("push_back")){
            int n = sc.nextInt();
            l.addLast(n);
        }
        else if(str.equals("pop_front")){
            System.out.println(l.pollFirst());
        }
        else if(str.equals("pop_back")){
            System.out.println(l.pollLast());
        }
        else if(str.equals("size")){
            System.out.println(l.size());
        }
        else if(str.equals("empty")){
            if(l.isEmpty())
                System.out.println(1);
            else
                System.out.println(0);
        }
        else if(str.equals("front")){
            System.out.println(l.peekFirst());
        }
        else if(str.equals("back")){
            System.out.println(l.peekLast());
        }
    }
}