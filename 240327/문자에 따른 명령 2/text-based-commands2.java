import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] dx = new int[]{ 1, 0, -1, 0 };
        int[] dy = new int[]{ 0, -1, 0, 1 };
        int stand = 3;
        int xLoc = 0, yLoc = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                stand--;
                // 음수가 되는 경우 처리
                if(stand == -1)
                    stand = 3;
            }
            else if(s.charAt(i) == 'R')
                stand++;
            else if(s.charAt(i) == 'F'){
                xLoc += dx[stand%4];
                yLoc += dy[stand%4];
            }
        }
        System.out.printf("%d %d", xLoc, yLoc);

    }
}