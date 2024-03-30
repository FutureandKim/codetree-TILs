import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cow = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
            cow[i] = sc.nextInt();

         for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    if (cow[i] <= cow[j] && cow[j] <= cow[z]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}