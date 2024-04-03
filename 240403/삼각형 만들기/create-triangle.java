import java.util.Scanner;

public class Main {
    public static int[][] dot;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dot = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                dot[i][j] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    max = Math.max(max, getTriangle(i, j, k));
                }
            }
        }
        System.out.print(max);
    }

    // x축, y축에 평행한 삼각형을 찾고 (넓이x2)를 반환하는 함수
    public static int getTriangle(int i, int j, int k){
        int x1 = dot[i][0], x2 = dot[j][0], x3 = dot[k][0];
        int y1 = dot[i][1], y2 = dot[j][1], y3 = dot[k][1];
        boolean isTrue = false;
        
        if(x1 == x2 && x1 != x3){
            if(y1 == y3 || y2 == y3)
                isTrue = true;
        }
        else if(x1 == x3 && x1 != x3){
            if(y1 == y2 || y3 == y2)
                isTrue = true;
        } else if(x2 == x3 && x1 != x2){
            if(y2 == y1 || y3 == y2)
                isTrue = true;
        }
        
        if(!isTrue)
            return 0;
        return ((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x2 * y1) + (x3 * y2) + (x1 * y3));
    }
}