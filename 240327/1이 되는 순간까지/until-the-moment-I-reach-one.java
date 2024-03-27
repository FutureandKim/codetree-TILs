import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        System.out.print(process(cnt, n));
    }

    public static int process(int cnt, int n){
        if(n == 1)
            return cnt;
        
        cnt++; 
        
        if(n % 2 == 0)  
            return process(cnt, n/2);
        else
            return process(cnt, n/3);
    }
}