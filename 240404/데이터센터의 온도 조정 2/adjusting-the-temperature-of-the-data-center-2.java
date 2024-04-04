import java.util.Scanner;

public class Main {
    public static int c, g, h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 장비의 개수
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int[][] tempArr = new int[n][2];
         
        for(int i = 0; i < n; i++){
            tempArr[i][0] = sc.nextInt();
            tempArr[i][1] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = -10; i < 1100; i++){
            int work = 0;
            for(int j = 0; j < n; j++)
                work += workload(i, tempArr[j][0], tempArr[j][1]); 
            max = Math.max(max, work);
        }
        System.out.print(max);
        /*
        for(int i = 0; i < n; i++){
            int work = 0;
            for(int j = -10; j < 1100; j++){
                work += workload(j, tempArr[i][0], tempArr[i][1]);
            }
            max = Math.max(max, work);
        }*/

    }

    public static int workload(int temp, int ta, int tb){
        if(temp < ta)
            return c;
        else if(temp <= tb)
            return g;
        else
            return h;
    }
}