import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ee = 0, eb = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e')
                ee++;
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b')
                eb++;
        }
        System.out.printf("%d %d", ee, eb);
        sc.close();
    }
}