import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[220];
        int idx = 100;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = 0; j < x; j++){
                    line[idx] += 1;
                    idx++;
                }
                line[idx] += 1;
            }
            else if(c == 'L'){
                for(int j = 0; j < x; j++){
                    line[idx] += 1;
                    idx--;
                }
                line[idx] += 1;
            }
        }

        int cnt = 0;
        int[] visit = new int[110];

        // 2번이상 방문한 점 찾기
        for(int i = 0; i < 220; i++){
            if(line[i] >= 2){
                visit[cnt] = i;
                cnt++;
            }
        }

        int res = 0;
        for(int i = 1; i < cnt; i++){
            if(visit[i] == visit[i-1]+1)
                res += 1;
        }
        System.out.print(res);
    }
}