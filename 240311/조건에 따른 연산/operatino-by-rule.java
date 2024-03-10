import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(true){
            if(n >= 1000){
                System.out.print(cnt);
                break;
            }
            if(n % 2 == 0)
                n = n*3 + 1;
            else if(n % 2 != 0)
                n = n*2 + 2;
            cnt++;
        }

    }
}