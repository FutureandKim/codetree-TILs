import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, cnt = 0;

        for(int i = 0; i < n; i++){
            String str = sc.next();
            sum += str.length();
            if(str.charAt(0) == 'a')
                cnt++;
        }
        System.out.printf("%d %d", sum, cnt);
    }
}