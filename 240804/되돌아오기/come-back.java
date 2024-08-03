import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dot = new int[]{0, 0}; // 시작 위치

        int cnt = 0;
        int res = -1;
        boolean isComeback = false;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int m = sc.nextInt();
            for(int j = 0; j < m; j++){
                cnt ++;
                if(move(dot, dir) && !isComeback){
                    res = cnt;
                    isComeback = true;
                }
            }
        }
        System.out.print(res);
    }

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
        }

        if(dot[0] == 0 && dot[1] == 0)
            return true;
        return false;
    }
}