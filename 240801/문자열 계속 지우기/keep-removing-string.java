import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String b = sc.next();

        boolean isContain = true;

        while(isContain == true){
            if(str.contains(b)){
                str = str.replace(b, "");
            } else
                isContain = false;
        }
        System.out.print(str);
    }
}