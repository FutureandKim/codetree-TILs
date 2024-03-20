import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] s = new Score[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            s[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(s);
        for(int i = n-1; i >= 0; i--)
            System.out.printf("%s %d %d %d\n", s[i].name, s[i].kor, s[i].eng, s[i].math);
    }
}

class Score implements Comparable<Score> {
    String name;
    int kor, eng, math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score){
        if(this.kor == score.kor){
            if(this.eng == score.eng)
                return this.math - score.math;
            return this.eng - score.eng;
        }
        return this.kor - score.kor;
    }
}