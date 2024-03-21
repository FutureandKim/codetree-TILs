import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int from = (11*1440) + (11*60) + 11;
        int to = (a*1440) + (b*60) + c;

        if(to - from < 0)
            System.out.print(-1);
        else
            System.out.print(to - from);
    }
}