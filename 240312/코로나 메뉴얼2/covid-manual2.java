import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, cnt = 0;
        char s;
        int[] c = new int[3];


        for(int i = 0; i < 3; i++){
            s = sc.next().charAt(0);
            t = sc.nextInt();

            if(s == 'Y'){
                if(t >= 37){
                    c[i] = 1;
                    cnt++;
                }
                else
                    c[i] = 3;
            } else {
                if(t >= 37)
                    c[i] = 2;
                else c[i] = 4;
            }
        }

        for(int i = 1; i <= 4; i++){
            int num = 0;
            for(int j = 0; j < 3; j++){
                if(c[j] == i)
                    num++;
            }
            System.out.printf("%d ", num);
        }

        if(cnt >= 2)
            System.out.print('E');
    }
}