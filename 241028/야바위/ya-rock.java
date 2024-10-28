import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[][] moves = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            moves[i][0] = scanner.nextInt();
            moves[i][1] = scanner.nextInt();
            moves[i][2] = scanner.nextInt();
        }
        
        int maxScore = 0;

        // 각 종이컵 위치에 조약돌을 놓고 점수 계산
        for (int startCup = 1; startCup <= 3; startCup++) {
            int currentCup = startCup;
            int score = 0;
            
            for (int[] move : moves) {
                int a = move[0];
                int b = move[1];
                int c = move[2];
                
                if (currentCup == a) {
                    currentCup = b;
                } else if (currentCup == b) {
                    currentCup = a;
                }
                
                if (currentCup == c) {
                    score++;
                }
            }
            maxScore = Math.max(maxScore, score);
        }
        
        System.out.println(maxScore);
    }
}