import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[1000];
        int idx = 500;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = 0; j < x; j++){
                    line[idx] += 1;
                    idx++;
                }
            }
            else if(c == 'L'){
                for(int j = 0; j < x; j++){
                    line[idx] += 1;
                    idx--;
                }
            }
        }

        int res = 0;
        for(int i = 0; i < 1000; i++){
            if(line[i] >= 2) {
                res++;
            }
        }
        System.out.println(res);
    }
}