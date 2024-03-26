import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dx = 0, dy = 0;

        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int m = sc.nextInt();
            if(c == 'W')
                dx -= m;
            if(c == 'S')
                dy -= m;
            if(c == 'N')
                dy += m;
            if(c == 'E')
                dx += m;
        }
        System.out.printf("%d %d", dx, dy);
    }
}