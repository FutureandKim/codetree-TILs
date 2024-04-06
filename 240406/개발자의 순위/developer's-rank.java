import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] rank = new int[k][n];
        int cnt = 0;

        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++)
                rank[i][j] = sc.nextInt();
        }

        // a가 b보다 순위가 높은 경우
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                for(int t = 0; t < k; t++){
                    if(rank[t][i] < rank[t][j])
                        break;
                    if(t == k-1)
                        cnt++;
                }
            }
        }

        // b가 a보다 순위가 높은 경우
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                for(int t = 0; t < k; t++){
                    if(rank[t][i] > rank[t][j])
                        break;
                    if(t == k-1)
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}