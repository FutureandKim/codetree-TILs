import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String a = "";
        String b = "";

        for(int i = 0; i < n1; i++){
            String s = sc.next();
            a += s;
        }

        for(int i = 0; i < n2; i++){
            String s = sc.next();
            b += s;
        }

        if(isPartial(a, b))
            System.out.print("Yes");
        else
            System.out.print("No");

    }

    // 연속부분수열 여부 판단 함수
    public static boolean isPartial(String a, String b) {
        if(a.contains(b))
            return true;
        return false;
    }
}