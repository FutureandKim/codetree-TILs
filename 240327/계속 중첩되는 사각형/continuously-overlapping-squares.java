import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] area = new int[201][201];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            for(int j = x1; j < x2; j++){
                for(int z = y1; z < y2; z++){
                    if(i % 2 == 0)
                        area[j][z] = -1;
                    else
                        area[j][z] = 1;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(area[i][j] == 1)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }    
}