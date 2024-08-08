import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[201];
        int idx = 100;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = 0; j < x; j++){
                    line[idx]++;
                    idx++;
                }
            } else if(c == 'L'){
                for(int j = 0; j < x; j++){
                    idx--;
                    line[idx]++;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < 201; i++) {
            // 2번 이상 방문한 영역 카운트
            if (line[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}