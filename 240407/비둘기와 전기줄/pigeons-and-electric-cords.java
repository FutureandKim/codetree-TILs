import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dove = new int[11]; // 비둘기의 현재 위치
        int[] lastLoc = new int[11]; // 비둘기의 마지막 위치
        int cnt = 0;

        for(int i = 0; i < 11; i++){
            dove[i] = -1;
            lastLoc[i] = -1;
        }


        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            int loc = sc.nextInt();
            if(dove[num] != -1){
                // 현재 위치와 마지막 위치가 같다면 제외
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