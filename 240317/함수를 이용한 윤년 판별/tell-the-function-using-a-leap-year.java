import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        boolean res = leapYear(y);
        System.out.print(res);
    }

    // 윤년 판별 함수
    public static boolean leapYear(int y) {
        if(y % 4 != 0)  
            return false;
        else {
            if(y % 100 == 0 && y % 400 != 0)
                return false;
        }
        return true;
    }
}