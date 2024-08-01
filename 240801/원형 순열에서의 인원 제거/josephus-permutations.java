import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++)
            q.add(i);

        while(!q.isEmpty()){
            // k 전까지 다 지우고 큐에 다시 추가
            for(int i = 0; i < k-1; i++)
                q.add(q.remove());
            
            // k 번째 수 출력
            System.out.print(q.poll() + " ");
        }
    }
}