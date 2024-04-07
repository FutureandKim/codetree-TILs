import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int len = 0;

        // 겹치지 않는 경우
        if(b < c || d < a)
            len = (b-a) + (d-c);
        // 겹치는 경우
        else if(a <= c && c <= b && b < d)
            len = d - a;
        else if(c <= a && a <= d && d < b)
            len = b - c;
        // 한 직선이 다른 직선 내에 포함되는 경우
        else if(a <= c && d <= b)
            len = b - a;
        else if(c <= a && b <= d)
            len = d - c;

        System.out.print(len);
    }
}