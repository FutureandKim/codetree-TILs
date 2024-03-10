import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt_y = 0;

        for(int i = 1; i <= n; i++){
            if(i % 4 == 0){
                cnt_y++;
                if((i % 100 == 0) && (i % 400 != 0))
                    cnt_y--;
            }
        }
        System.out.print(cnt_y);
    }
}