import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int time = sc.nextInt();

        Bomb b = new Bomb(code, color, time);
        System.out.printf("code : %s\ncolor : %c\nsecond : %d", b.code, b.color, b.time);

    }
}

class Bomb {
    String code;
    char color;
    int time;

    public Bomb(String code, char color, int time){
        this.code = code;
        this.color = color;
        this.time = time;
    }
}