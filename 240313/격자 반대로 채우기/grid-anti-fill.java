import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = n*n;

        if(n % 2 == 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i % 2 == 0)
                        arr[(n-1)-j][i] = cnt--;
                    else
                        arr[j][i] = cnt--;
                }
            }
        } else{
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i % 2 != 0)
                        arr[(n-1)-j][i] = cnt--;
                    else
                        arr[j][i] = cnt--;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.printf("%d ", arr[i][j]);
            System.out.println();
        }
    }
}