import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, i = 1;

        while(true){
            i *= 2;
            cnt++;
            if(i == n){
                System.out.print(cnt);
                break;
            }
        }
        
    }
}