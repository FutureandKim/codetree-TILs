import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        boolean isOverlap = true;

        if(x2 < a1 || a2 < x1) isOverlap = false;
        if(b2 < y1 || y2 < b2) isOverlap = false;

        System.out.print(isOverlap ? "overlapping" : "nonoverlapping");
    }
}