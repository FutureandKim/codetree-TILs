import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(isAns(a, b));
    }

    public static int isAns(int a, int b){
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if((i/10)%3 == 0 || (i%10)%3 == 0)
                cnt++;
            else if(i%3 == 0)
                cnt++;
        }
        return cnt;
    }
}