import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = isAns(0, n);
        System.out.print(ans);
    }

    public static int isAns(int cnt, int n){
        if(n == 1)  
            return cnt;
        else if(n%2 == 1){
            cnt++;
            return isAns(cnt, n*3+1);
        }
        else{
            cnt++;
            return isAns(cnt, n/2);
        }
    }
}