import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) // 3의 배수인 경우 
                System.out.printf("%d ", 0); 
            else if(i <= 10) // 3의 배수가 아닌 10 이하의 자연수
                System.out.printf("%d ", i);
            else if(i % 10 == 0){ // 3의 배수가 아닌 10 초과 수 중 10의 배수
                if((i/10)%3 == 0)
                    System.out.printf("%d ", 0);
                else
                    System.out.printf("%d ", i); 
            }
            else { // 나머지 수
                if((i / 10) % 3 == 0 || (i % 10) % 3 == 0)
                    System.out.printf("%d ", 0);
                else
                    System.out.printf("%d ", i);
            }
        }
    }
}