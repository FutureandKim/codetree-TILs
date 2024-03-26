import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] aLoc = new int[1000001];
        int[] bLoc = new int[1000001];
        int aStart = 1, bStart = 1;

        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = aStart; j <= aStart+t; j++)
                aLoc[j] = aLoc[j-1] + v;
            aStart+=t;
        }

        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = bStart; j <= bStart+t; j++)
                bLoc[j] = bLoc[j-1] + v;
            bStart+=t;
        }
/*
        for(int i = 0; i < bStart; i++)
            System.out.println(aLoc[i] + " " + bLoc[i]); */

        int cnt = 0;
        for(int i = 2; i < bStart; i++){
            if(aLoc[i] > bLoc[i]){
                if(aLoc[i-1] <= bLoc[i-1])
                    cnt++;
            }
            if(aLoc[i] < bLoc[i]){
                if(aLoc[i-1] >= bLoc[i-1])
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}