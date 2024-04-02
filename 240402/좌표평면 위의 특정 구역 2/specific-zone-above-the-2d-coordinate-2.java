import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[n][2];
        int minWidth = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                p[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for(int j = 0; j < n; j++){
                if(j != i){
                minX = Math.min(minX, p[j][0]);
                maxX = Math.max(maxX, p[j][0]);
                }
            }        
            //System.out.println(minX + " "+ maxX);

            for(int j = 0; j < n; j++){
                if(j != i){
                minY = Math.min(minY, p[j][1]);
                maxY = Math.max(maxY, p[j][1]);
                }
            }        
            //System.out.println(minY + " "+ maxY);
            int res = (maxX - minX) * (maxY - minY);
            minWidth = Math.min(minWidth, res);
        }
        System.out.print(minWidth);
    }
}