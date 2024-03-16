import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String origin = str;

        while(true){
            System.out.println(str);
            str = str.substring(str.length()-1) + str.substring(0, str.length()-1);
            if(str.equals(origin)){
                System.out.println(str);
                break;
            }
        }
    }
}