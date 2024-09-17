import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static int n;
    public static int[][] vill;
    public static boolean[][] visited;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        vill = new int[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                vill[i][j] = sc.nextInt();
        }

        //마을별 사람수
        ArrayList<Integer> peopleNum = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //사람이 있고 방문한적 없는 지점 선택
                if(vill[i][j] == 1 && !visited[i][j]){
                    peopleNum.add(peopleInVill(i, j));
                }
            }
        }

        Collections.sort(peopleNum);
        System.out.println(peopleNum.size());

        for(int num : peopleNum){
            System.out.println(num);
        }

    }

    // dfs로 사람 수 계산하는 함수
    public static int peopleInVill(int i, int j){
        visited[i][j] = true;
        int cnt = 1;

        for(int d = 0; d < 4; d++){
            int row = i + dx[d];
            int col = j + dy[d];

            if((row >= 0 && row < n) && (col >= 0 && col < n) && vill[row][col] == 1 && !visited[row][col]){
                cnt += peopleInVill(row, col);
            }
        }

        return cnt;
    }
}