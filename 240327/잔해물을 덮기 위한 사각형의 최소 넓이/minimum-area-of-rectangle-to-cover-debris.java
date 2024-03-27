import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] box = new int[2001][2001];
        int cnt = 0;

        // 첫번째 직사각형
        int fx1 = sc.nextInt() + 1000;
        int fy1 = sc.nextInt() + 1000;
        int fx2 = sc.nextInt() + 1000;
        int fy2 = sc.nextInt() + 1000;

        // 두번째 직사각형
        int sx1 = sc.nextInt() + 1000;
        int sy1 = sc.nextInt() + 1000;
        int sx2 = sc.nextInt() + 1000;
        int sy2 = sc.nextInt() + 1000;

        for(int i = fx1; i < fx2; i++){
            for(int j = fy1; j < fy2; j++)
                box[i][j]++;
        }

        for(int i = sx1; i < sx2; i++){
            for(int j = sy1; j < sy2; j++)
                box[i][j]++;
        }

        for(int i = fx1; i < fx2; i++){
            for(int j = fy1; j < fy2; j++){
                if(box[i][j] == 2){
                    if(box[i-1][j] != 2 || box[i][j-1] != 2 || box[i+1][j] != 2 || box[i][j+1] != 2)
                        cnt++;
                } else if(box[i][j] == 1)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}