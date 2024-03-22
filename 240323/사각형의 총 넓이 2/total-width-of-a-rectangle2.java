import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j = x1+100; j < x2+100; j++){
                for(int z = y1+100; z < y2+100; z++)
                    arr[j][z] += 1;
            }
        }

        int cnt = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(arr[i][j] >= 1)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}