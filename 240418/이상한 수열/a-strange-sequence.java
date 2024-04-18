import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(isStrangeNum(n));
    }

    public static int isStrangeNum(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        return(isStrangeNum(n/3) + isStrangeNum(n-1));
    }
}