import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        
        int len = sc.nextInt();

        for(int i = 0; i < len; i++){
            String str = sc.next();

            if(str.equals("push")){
                int n = sc.nextInt();
                s.push(n);
            }
            else if(str.equals("size"))
                System.out.println(s.size());
            else if(str.equals("empty")){
                if(s.isEmpty()) 
                    System.out.println(1);
                else System.out.println(0);
            }
            else if(str.equals("top"))
                System.out.println(s.peek());
            else if(str.equals("pop"))
                System.out.println(s.pop());
            
        }
    }
}