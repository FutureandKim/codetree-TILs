import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] omok = new int[19][19];
        boolean isWin = false;

        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++)
                omok[i][j] = sc.nextInt();
        }

        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 15; j++){
                // 가로
                if(omok[i][j] == 1 && omok[i][j+1] == 1 && omok[i][j+2] == 1 && omok[i][j+3] == 1 && omok[i][j+4] == 1){
                    System.out.printf("%d\n%d %d", 1, i+1, j+3);
                    isWin = true;
                    break;
                }
                else if(omok[i][j] == 2 && omok[i][j+1] == 2 && omok[i][j+2] == 2 && omok[i][j+3] == 2 && omok[i][j+4] == 2){
                    System.out.printf("%d\n%d %d", 2, i+1, j+3);
                    isWin = true;
                    break;
                }
                // 대각선 (y=-x 방향)
                else if(omok[i][j] == 1 && omok[i+1][j+1] == 1 && omok[i+2][i+2] == 1 && omok[i+3][j+3] == 1 && omok[i+4][j+4] == 1){
                    System.out.printf("%d\n%d %d", 1, i+3, j+3);
                    isWin = true;
                    break;
                }
                else if(omok[i][j] == 1 && omok[i+1][j+1] == 2 && omok[i+2][i+2] == 2 && omok[i+3][j+3] == 2 && omok[i+4][j+4] == 2){
                    System.out.printf("%d\n%d %d", 2, i+3, j+3);
                    isWin = true;
                    break;
                }
            }
        }


        // 세로
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 15; j++){
                if(omok[j][i] == 1 && omok[j+1][i] == 1 && omok[j+2][i] == 1 && omok[j+3][i] == 1 && omok[j+4][i] == 1){
                    System.out.printf("%d\n%d %d", 1, j+3, i+1);
                    isWin = true;
                    break;
                }
                else if(omok[j][i] == 2 && omok[j+1][i] == 2 && omok[j+2][i] == 2 && omok[j+3][i] == 2 && omok[j+4][i] == 2){
                    System.out.printf("%d\n%d %d", 2, j+3, i+1);
                    isWin = true;
                    break;
                }
            }
        }

        for(int i = 5; i < 19; i++){
            for(int j = 0; j < 15; j++){
                // 대각선 (y=x 방향)
                if(omok[i][j] == 1 && omok[i-1][j+1] == 1 && omok[i-2][j+2] == 1 && omok[i-3][j+3] == 1 && omok[i-4][j+4] == 1){
                    System.out.printf("%d\n%d %d", 2, i-1, j+3);
                    isWin = true;
                    break;
                }
                else if(omok[i][j] == 2 && omok[i-1][j+1] == 2 && omok[i-2][j+2] == 2 && omok[i-3][j+3] == 2 && omok[i-4][j+4] == 2){
                    System.out.printf("%d\n%d %d", 2, i-1, j+3);
                    isWin = true;
                    break;
                }
            }
        }

        if(isWin == false)
            System.out.print(0);
    }
}