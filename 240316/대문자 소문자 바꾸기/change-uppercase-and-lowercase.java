import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                char c = (char)(str.charAt(i) - 'A' + 'a');
                System.out.print(c);
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                char c = (char)(str.charAt(i) - 'a' + 'A');
                System.out.print(c);
            }
        }
    }
}