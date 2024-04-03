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

    // 한 변은 x축에 평행, 한 변은 y축에 평행한 삼각형을 찾고 (넓이x2)를 반환하는 함수
    public static int getTriangle(int i, int j, int k){
        int x1 = dot[i][0], x2 = dot[j][0], x3 = dot[k][0];
        int y1 = dot[i][1], y2 = dot[j][1], y3 = dot[k][1];
        boolean isTrue = false;
        
        if(x1 == x2){
            if(y1 == y3 || y2 == y3)
                isTrue = true;
        }
        else if(x1 == x3){
            if(y1 == y2 || y3 == y2)
                isTrue = true;
        } 
        else if(x2 == x3){
            if(y2 == y1 || y3 == y2)
                isTrue = true;
        }
        
        
        if(!isTrue)
            return 0;

        // 모든 점이 0이 되지 않도록 설정
        while(true){
            if(x1 != 0 && x2 != 0 && x3 != 0 && y1 != 0 && y2 != 0 && y3 != 0)
                break;
            x1 += 10;
            x2 += 10;
            x3 += 10;
            y1 += 10;
            y2 += 10;
            y3 += 10;
        }
        return Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));
    }
}