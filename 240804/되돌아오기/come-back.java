import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dot = new int[]{0, 0}; // 시작 위치

        int cnt = 0; // 움직인 거리
        int res = -1; // 원점으로 돌아올 때까지 걸린 거리
        boolean isReturn = false; // 원점으로 돌아온 적 있는지 판단

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int m = sc.nextInt();

            for(int j = 0; j < m; j++){
                cnt++;
                if(move(dot, dir) && !isReturn){
                    res = cnt;
                    isReturn = true;
                }
            }
        }
        System.out.print(res);
    }

    // 움직임 동작 및 원점에 돌아왔는지 판단하는 함수
    public static boolean move(int[] dot, char dir){
        switch(dir){
            case 'N':
                dot[1] += 1;
                break;
            case 'E':
                dot[0] += 1;
                break;
            case 'S':
                dot[1] -= 1;
                break;
            case 'W':
                dot[0] -= 1;
                break;
        }
        if(dot[0] == 0 && dot[1] == 0)
            return true;
        return false;
    }
}