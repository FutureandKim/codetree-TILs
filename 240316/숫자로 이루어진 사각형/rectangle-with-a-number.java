import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        square(n);
    }

    // 정사각형 출력 함수
    public static void square(int n) {
        int cnt = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(cnt + " ");
                if(cnt == 9) cnt = 0;
                cnt++;
            }
            System.out.println();
        }
    }
}