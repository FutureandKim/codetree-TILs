import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        NextLevel n1 = new NextLevel();
        NextLevel n2 = new NextLevel(str, n);
        System.out.printf("user %s lv %d\n", n1.id, n1.level);
        System.out.printf("user %s lv %d", n2.id, n2.level);
    }
}

class NextLevel {
    String id;
    int level;

    public NextLevel() {
        this.id = "codetree";
        this.level = 10;
    }

    public NextLevel(String id, int level) {
        this.id = id;
        this.level = level;
    }
};