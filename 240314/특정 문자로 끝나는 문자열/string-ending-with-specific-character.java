import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];

        for(int i = 0; i < 10; i++)
            str[i] = sc.next();
        
        char c = sc.next().charAt(0);

        for(int i = 0; i < 10; i++){
            if(str[i].charAt(str[i].length()-1) == c)
                System.out.println(str[i]);
        }
        sc.close();
    }
}