import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isResultNumber(i))
                cnt++;
        }
        System.out.print(cnt);
    }

    public static boolean isResultNumber(int n) {
        return n % 3 == 0 || isContain369(n);
    }

    // 숫자에 3, 6, 9가 있는지 확인하는 함수
    public static boolean isContain369(int n) {
        String str = Integer.toString(n);
        
        return (str.contains("3") || str.contains("6") || str.contains("9"));
    }
}