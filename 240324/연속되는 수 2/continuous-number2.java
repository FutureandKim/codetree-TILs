import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i == 0 || numArr[i] != numArr[i-1])
                cnt++;
        }
        System.out.print(cnt);
    }
}