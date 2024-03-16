import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String str = Integer.toString(n1+n2);
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1')
                cnt++;
        }
        System.out.print(cnt);
    }
}