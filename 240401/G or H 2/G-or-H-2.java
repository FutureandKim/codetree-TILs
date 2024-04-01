import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] loc = new char[101];
        int idxArr[] = new int[n]; // 사람 위치를 저장할 배열
        int len = 0;

        for(int i = 0; i < n; i++){
            int idx = sc.nextInt();
            char c = sc.next().charAt(0);
            loc[idx] = c;
            idxArr[i] = idx; 
        }

        Arrays.sort(idxArr);

        int max = 0;
        for(int i = 0; i < n; i++){
            // (i, i) (i, i+1) (i, i+2) ... 완전탐색
            for(int j = i; j < n; j++){
                int cntG = 0, cntH = 0;
                for(int z = i; z <= j; z++){
                    if(loc[idxArr[z]] == 'G')
                        cntG++;
                    if(loc[idxArr[z]] == 'H')
                        cntH++;
                }
                if(cntG == cntH || (cntG == 0 && cntH != 0) || (cntG != 0 && cntH == 0))
                    len = idxArr[j]-idxArr[i];
                max = Math.max(max, len);
            }
        }
        System.out.print(max);
    }
}