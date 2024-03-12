import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[99];
        int a_num = 0; // 배열 a의 데이터 수

        for(int i = 0; i < 99; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0)
                break;
            a_num = i;
        }

        for(int i = 1; i <= 9; i++){
            int cnt = 0;
            for(int j = 0; j <= a_num; j++){
                if(a[j]/10 == i)
                    cnt++;
            }
            System.out.printf("%d - %d\n", i, cnt);
        }

    }
}