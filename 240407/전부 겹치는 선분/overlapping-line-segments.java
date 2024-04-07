import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] line = new int[n][2];
        int[] arr = new int[101];
        boolean isOverlap = false;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++)
                line[i][j] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int start = line[i][0];
            int fin = line[i][1];
            for(int j = start; j <= fin; j++)
                arr[j]++;
        }

        for(int i = 0; i < 100; i++){
            if(arr[i] == n){
                isOverlap = true;
                break;
            }
        }

        System.out.print(isOverlap ? "Yes" : "No");
    }
}