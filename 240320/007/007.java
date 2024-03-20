import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char place = sc.next().charAt(0);
        int time = sc.nextInt();
        SecretCode s1 = new SecretCode(code, place, time);
        System.out.printf("secret code : %s\nmeeting point : %c\ntime : %d", s1.code, s1.place, s1.time);
    }
}

class SecretCode {
    String code;
    char place;
    int time;

    public SecretCode(String code, char place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }
}