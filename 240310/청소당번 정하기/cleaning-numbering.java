import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt_class = 0, cnt_hall = 0, cnt_toilet = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0)
                cnt_class++;
            if(i % 3 == 0){
                cnt_hall++;
                if(i % 2 == 0)
                    cnt_class--;
            }
            if(i % 12 == 0){
                cnt_toilet++;
                if(i % 3 == 0)
                    cnt_hall--;
                else if(i % 2 == 0)
                    cnt_class--;
            }
        }
        System.out.printf("%d %d %d", cnt_class, cnt_hall, cnt_toilet);
    }
}