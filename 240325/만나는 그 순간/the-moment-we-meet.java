import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000];
        int[] b = new int[1000];
        int aStart = 0, bStart = 0, aIdx = 0, bIdx = 0, cnt;

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if(c == 'R'){
                cnt = 0;
                while(true){
                    a[aIdx++] =  aStart;
                    aStart++;
                    cnt++;
                    if(cnt == s)
                        break;
                }
            } else if(c == 'L'){
                cnt = 0;
                while(true){
                    a[aIdx++] =  aStart;
                    aStart--;
                    cnt++;
                    if(cnt == s)
                        break;
                }
            }
        }

        for(int i = 0; i < m; i++){
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if(c == 'R'){
                cnt = 0;
                while(true){
                    b[bIdx++] =  bStart;
                    bStart++;
                    cnt++;
                    if(cnt == s)
                        break;
                }
            } else if(c == 'L'){
                cnt = 0;
                while(true){
                    b[bIdx++] =  bStart;
                    bStart--;
                    cnt++;
                    if(cnt == s)
                        break;
                }
            }
        }

        int meet = -1;
        for(int i = 1; i < 1000; i++){
            if(a[i] == b[i]){
                meet = i;
                break;
            }
        }
        System.out.print(meet);
    }
}