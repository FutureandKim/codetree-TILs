import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        int len = sc.nextInt();

        for(int i = 0; i < len; i++){
            dq.addLast(i+1);
        }

        while(dq.size() > 1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.peekFirst());
    }
}