import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] dove = new int[11];
        int[] lastLoc = new int[11];
        int cnt = 0;
/*
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                arr[i][j] = sc.nextInt();
        }*/

        for(int i = 0; i < 11; i++){
            dove[i] = -1;
            lastLoc[i] = -1;
        }


        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            int loc = sc.nextInt();
            if(dove[num] != -1){
                if(loc == lastLoc[num])
                    continue;
                else cnt++;
            }
            dove[num] = loc;
            lastLoc[num] = loc;
        }
        System.out.print(cnt);
    }
}