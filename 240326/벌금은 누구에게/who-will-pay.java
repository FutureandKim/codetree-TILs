import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n];
        int[] penalty = new int[n];

        int cnt = 0;
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            students[p-1]++;
            if(students[p-1] == (k-1))
                penalty[cnt++] = p;
        }
        System.out.print(penalty[0] == 0 ? -1: penalty[0]);
    }
}