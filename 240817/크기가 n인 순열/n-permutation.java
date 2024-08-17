import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static boolean[] visited = new boolean[n+1];
    public static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        choose(1);
    }

    public static void choose(int currentNum){
        if(currentNum == n + 1){
            for(int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            ans.add(i);

            choose(currentNum + 1);

            ans.remove(ans.size() - 1);
            visited[i] = false;
        }

    }
}