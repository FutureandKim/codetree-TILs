import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] Agents = new Agent[5];
        char minName = 'A';
        int min = 101;

        // 요원 정보 입력
        for(int i = 0; i < 5; i++){
            char name = sc.next().charAt(0);
            int score = sc.nextInt();
            Agents[i] = new Agent(name, score);
        }

        // 점수가 제일 낮은 요원 찾기
        for(int i = 0; i < 5; i++){
            if(Agents[i].score < min){
                minName = Agents[i].name;
                min = Agents[i].score;
            }
        }
        System.out.printf("%c %d", minName, min);
    }
}

class Agent {
    char name;
    int score;

    public Agent(char name, int score) {
        this.name = name;
        this.score = score;
    }
}