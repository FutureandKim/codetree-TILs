import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        boolean res = isDate(m, d);
        System.out.print(res? "Yes" : "No");
    }

    // 날짜 유무 판별 함수
    public static boolean isDate(int m, int d){


        if(m >= 1 && m <= 7){
            if(m == 2){
                if(d >= 1 && d <= 28)
                return true;
            }
            else if(m % 2 == 0){
                if(d >= 1 && d <= 30)
                    return true;
            }
            else{
                if(d >= 1 && d <= 31)
                    return true;
            }
        } else if(m <= 12){
            if(m % 2 == 0){
                if(d >= 1 && d <= 31)
                    return true;
            }
            else{
                if(d >= 1 && d <= 31)
                    return true;
            }
        }
        return false;
    }
}