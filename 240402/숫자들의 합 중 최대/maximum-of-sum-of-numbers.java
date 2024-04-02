import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = 0;

        for(int i = x; i <= y; i++)
            max = Math.max(max, sumOfEachDigit(i));
        System.out.print(max);
    }

    // 각 자리 숫자의 합을 구하는 함수
    public static int sumOfEachDigit(int n){
        int sum = 0;
        while(true){
            if(n == 0)
                break;
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}