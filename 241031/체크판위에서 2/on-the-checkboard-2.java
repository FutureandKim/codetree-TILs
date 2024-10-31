import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] board;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        board = new char[R][C];
        
        sc.nextLine();
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine().replace(" ", "");
            board[i] = line.toCharArray();
        }
        
        dfs(0, 0, 0, ' ', 0);
        
        System.out.println(count);
    }

    static void dfs(int row, int col, int jumpCount, char lastColor, int colorSwitches) {
        // 보드 범위를 벗어나는지 확인
        if (row >= R || col >= C) return;

        // 오른쪽 하단에 도착했고, 색상 변경이 2번이 되었을 경우 유효한 경로로 카운트 증가
        if (row == R - 1 && col == C - 1 && colorSwitches == 2) {
            count++;
            return;
        }
        
        // 색상이 다를 경우에만 이동 가능
        if (lastColor == board[row][col]) {
            return;
        }
        
        // 색상 변경이 있을 경우 색상 변경 카운트 증가
        if (lastColor != ' ' && board[row][col] != lastColor) {
            colorSwitches++;
        }
        
        // 최대 2번의 색상 변경만 허용
        if (colorSwitches > 2) {
            return;
        }

        // 오른쪽 아래로 이동 가능한 모든 칸 탐색
        for (int i = row + 1; i < R; i++) {
            for (int j = col + 1; j < C; j++) {
                dfs(i, j, jumpCount + 1, board[row][col], colorSwitches);
            }
        }
    }
}