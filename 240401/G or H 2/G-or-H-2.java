import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] loc = new char[101];
        int maxLoc = 0;
        int len = 0, k;

        for(int i = 0; i < n; i++){
            int idx = sc.nextInt();
            char c = sc.next().charAt(0);
            loc[idx] = c;
            maxLoc = Math.max(idx, maxLoc);
        }

        int max = 0;
        int minG = Integer.MAX_VALUE, minH = Integer.MAX_VALUE;
        int maxG = Integer.MIN_VALUE, maxH = Integer.MIN_VALUE;
        int minS = Integer.MAX_VALUE, maxS = Integer.MIN_VALUE;
        for(int i = 1; i < maxLoc-1; i++){
            for(int j = 1; j < maxLoc-1; j++){
                int cntG = 0, cntH = 0;
                for(k = i; k <= j; k++){
                    if(loc[k] == 'G'){
                        cntG++;
                        minG = Math.min(minG, k);
                        maxG = Math.max(maxG, k);
                    }
                    if(loc[k] == 'H'){
                        cntH++;
                        minH = Math.min(minH, k);
                        maxH = Math.max(maxH, k);
                    }
                }
                //System.out.println(cntG +" " + cntH + " k:"+k + " i:"+i);
                minS = Math.min(minG, minH);
                maxS = Math.max(maxG, maxG);
                if(cntG == 0 && cntH == 0)
                    continue;
                else if((cntG == 0 && cntH != 0) || (cntG != 0 && cntH == 0) || cntG == cntH)
                    len = maxS-minS+1;
                max = Math.max(max, len);
            }
        }
        System.out.print(max);
    }
}