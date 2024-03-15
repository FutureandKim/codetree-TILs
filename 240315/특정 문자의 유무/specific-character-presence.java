import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ee = false, ab = false;


        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("ee")) {
                ee = true;
                break;
            }
        }
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("ab")) {
                ab = true;
                break;
            }
        }

        if(ee == true)
            System.out.print("Yes ");
        else
            System.out.print("No ");

        if(ab == true)
            System.out.print("Yes");
        else
            System.out.print("No");
            
        sc.close();
    }
}