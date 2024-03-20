import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] s = new Score[n];

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();
            s[i] = new Score(str, sub1, sub2, sub3);
        }

        Arrays.sort(s);
        for(int i = 0; i < n; i++) {
            System.out.printf("%s %d %d %d\n", s[i].name, s[i].sub1, s[i].sub2, s[i].sub3);
        }
    }
}

class Score implements Comparable<Score> {
    String name;
    int sub1, sub2, sub3;

    public Score(String name, int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int compareTo(Score score) {
        return (this.sub1 + this.sub2 + this.sub3) - (score.sub1 + score.sub2 + score.sub3);
    } 
}