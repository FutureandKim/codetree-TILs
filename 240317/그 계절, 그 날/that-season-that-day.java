import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int res = isDate(y, m, d);
        System.out.print(res > 0 ? weather(m) : res);

    }

    // 윤년 판별 함수
    public static boolean isLeapYear(int y) {
        if(y % 4 != 0)  
            return false;
        else {
            if(y % 100 == 0 && y % 400 != 0)
                return false;
        }
        return true;
    }

    // 날짜 유무 판별 함수
    public static int isDate(int y, int m, int d) {
        int[] d30 = new int[]{ 4, 6, 9, 11 };
        int[] d31 = new int[]{ 1, 3, 5, 7, 8, 10, 12 };

        if(m == 2) {
            if(isLeapYear(y)){
                if(d >= 1 && d <= 29)
                    return m;
            } 
            else {
                if(d >= 1 && d <= 28)
                    return m;
          }
        }

        for(int i = 0; i < d30.length; i++){
            if(m == d30[i]){
                if(d >= 1 && d <= 30)
                    return m;
            }
        }

        for(int i = 0; i < d31.length; i++){
            if(m == d31[i]){
                if(d >= 1 && d <= 31)
                    return m;
            }
        }
        return -1;
    }

    // 계절 판별 함수
    public static String weather(int m){
        if(m >= 3 && m <= 5)
            return "Spring";
        else if(m >= 6 && m <= 8)
            return "Summer";
        else if(m >= 9 && m <= 11)
            return "Fall";
        else
            return "Winter";
    }
}