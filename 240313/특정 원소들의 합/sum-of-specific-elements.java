import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sum = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
                arr[i][j] = sc.nextInt();
        }

        for(int i = 0; i < 4; i++){
            for(int j = i; j < 4; j++){
                sum += arr[j][i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}