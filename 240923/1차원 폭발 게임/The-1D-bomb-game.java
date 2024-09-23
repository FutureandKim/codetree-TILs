import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] bombArr = new int[n][2];

        int cnt = 0;
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            if(cnt > 0 && bombArr[cnt-1][0] == b){
                bombArr[cnt-1][1]++;
                cnt++;
            } else {
                bombArr[cnt][0] = b;
            }
        }

        ArrayList<Integer> resArr = new ArrayList<Integer>();
        for(int i = 0; i < cnt; i++){
            if(bombArr[i][1] == 1)
                resArr.add(bombArr[i][0]); 
        }

        System.out.println(resArr.size());
        for(int res : resArr)
            System.out.println(res);

    }
}