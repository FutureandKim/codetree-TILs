import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if(s.length() % 2 == 0){
            for(int i = 0; i < s.length(); i+=2)
                System.out.print(s.charAt(s.length()-1-i));
        }
        else{
            for(int i = 1; i < s.length(); i+=2)
                System.out.print(s.charAt(s.length()-1-i));
        }

        sc.close();
    }
}