import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] width = new int[201][201];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt() + 100;
            int y = sc.nextInt() + 100;
            for(int j = x; j < x+8; j++){
                for(int z = y; z < y+8; z++)
                    width[j][z] += 1;
            }
        }

        int cnt = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++)
                if(width[i][j] >= 1)
                    cnt++;
        }
        System.out.print(cnt);
    }
}