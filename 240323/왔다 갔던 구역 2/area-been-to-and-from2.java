import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[200];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = 100; j <= 100+x; j++)
                    line[j] += 1;
            }
            else if(c == 'L'){
                for(int j = 100+x; j >= 100; j--)
                    line[j] += 1;
            }
        }

        int max = -1;
        for(int i = 0; i < 200; i++){
            if(line[i] > max)
                max = line[i];
        }
        System.out.print(max);
    }
}