import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String all = ""; //모든 숫자를 저장할 문자열

        for(int i = 0; i < n; i++){
            String s = sc.next();
            all += s;
        }

        for(int i = 0; i < all.length(); i++){
            System.out.print(all.charAt(i));
            if((i+1)%5 == 0)
                System.out.println();
        }
        sc.close();
    }
}