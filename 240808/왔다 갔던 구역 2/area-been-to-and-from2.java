import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[4001];
        int idx = 2000;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'R'){
                for(int j = 0; j < x; j++){
                    line[idx]++;
                    idx++;
                }
            } else if(c == 'L'){
                for(int j = 0; j < x; j++){
                    idx--;
                    line[idx]++;
                }
            }
        }

        int res = 0;

        for (int i = 0; i < 4001; i++) {
            if (line[i] >= 2) {
                res++;
            }
        }

        System.out.println(res);
    }
}