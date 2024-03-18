import java.util.Scanner;

public class Main {
    public static String strAll = "";
    public static String strParts = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strAll = sc.next();
        strParts = sc.next();

        System.out.print(index());
    }
    
    // 부분 문자열 인덱스 구하는 함수
    public static int index() {
        int idx = -1;
        if(strAll.contains(strParts))
            idx = strAll.indexOf(strParts);
        return idx;
    }
}