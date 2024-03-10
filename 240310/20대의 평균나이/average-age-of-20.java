import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, sum = 0, cnt = 0;

        while(true){
            age = sc.nextInt();
            
            if(age / 10 != 2)
                break;

            sum += age;
            cnt++;
        }
        System.out.printf("%.2f", (double)sum/cnt);
    }
}