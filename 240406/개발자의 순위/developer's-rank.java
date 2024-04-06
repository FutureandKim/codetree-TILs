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

        // (i, j) 개발자 선택
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j)
                    continue;
                boolean isWin = true;

                // rank 배열 순환
                for(int t = 0; t < k; t++){
                    int a = -1, b = -1;
                    for(int z = 0; z < n; z++){
                        if(rank[t][z] == i) a = z;
                        if(rank[t][z] == j) b = z;
                    }

                    if(a > b){
                        isWin = false;
                        break;
                    }
                }
                if(isWin) cnt++;
            }
        }

        System.out.print(cnt);
    }
}