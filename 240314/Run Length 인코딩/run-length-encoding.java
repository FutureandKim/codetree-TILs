import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        char temp = a.charAt(0);
        str += temp;
        int cnt = 1;

        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) != temp){
                str = str + cnt + a.charAt(i);
                temp = a.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }

        // 마지막 cnt 처리
        str = str + cnt;

        System.out.printf("%d\n%s", str.length(), str);
        sc.close();
    }
}