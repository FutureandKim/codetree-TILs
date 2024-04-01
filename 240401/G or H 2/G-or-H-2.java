import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] loc = new char[101];
        int idxArr[] = new int[n];
        int maxLoc = 0;
        int len = 0, k, cntG = 0, cntH = 0;

        for(int i = 0; i < n; i++){
            int idx = sc.nextInt();
            char c = sc.next().charAt(0);
            loc[idx] = c;
            idxArr[i] = idx;
            maxLoc = Math.max(idx, maxLoc);
        }

        Arrays.sort(idxArr);

        int max = 0;
        for(int i = 0; i < n; i++){   
            for(int j = i+1; j < n; j++){
                cntG = 0;
                cntH = 0;
                for(int z = i; z <= j; z++){
                    if(loc[idxArr[z]] == 'G')
                        cntG++;
                    if(loc[idxArr[z]] == 'H')
                        cntH++;
                }
                //System.out.println(cntG +" " + cntH + "| i:"+ idxArr[i] +  " j: "+ idxArr[j]);
                if(cntG == cntH || (cntG == 0 && cntH != 0) || (cntG != 0 && cntH == 0))
                    len = idxArr[j]-idxArr[i];
                max = Math.max(max, len);
            }
        }
        System.out.print(max);
    }
}