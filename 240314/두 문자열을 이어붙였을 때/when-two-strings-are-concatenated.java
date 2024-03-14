import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = "", ba = "";
        boolean res = true;

        ab = a+b;
        ba = b+a;

        for(int i = 0; i < ab.length(); i++){
            if(ab.charAt(i) == ba.charAt(i))
                continue;
            else{
                res = false;
                break;
            }
        }

        System.out.print(res);
        sc.close();
    }
}