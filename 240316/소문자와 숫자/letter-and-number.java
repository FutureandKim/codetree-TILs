import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                    System.out.print((char)(str.charAt(i) + 32));
                else
                    System.out.print(str.charAt(i));
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                System.out.print(str.charAt(i));
        
        }
    }
}