import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int len = a.length(); // 문자열 길이
        int idx = -1;
        
        for(int i = 0; i < len; i++){
            if(a.equals(b)){
                idx = i;
                break;
            }
            a = a.substring(len-1) + a.substring(0, len-1);
        }
        System.out.print(idx);
    }
}