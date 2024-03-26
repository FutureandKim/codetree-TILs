import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] aLoc = new int[1000001]; // 시간별 A의 위치정보 저장할 배열
        int[] bLoc = new int[1000001]; // 시간별 B의 위치정보 저장할 배열
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

        // 같은 인덱스에서 한 배열의 값이 다른 배열의 값보다 커질 때 cnt 증가
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