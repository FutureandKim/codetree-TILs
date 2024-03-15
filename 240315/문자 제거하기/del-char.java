import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        while(s.length() > 1){
            int n = sc.nextInt();
            if(n != 0){
                if(n >= s.length())
                    s = s.substring(0, s.length()-1);
                else
                    s = s.substring(0, n) + s.substring(n+1);
                System.out.println(s);
            } else if(n == 0){
                s = s.substring(1);
                System.out.println(s);
            }
        }
    }
}