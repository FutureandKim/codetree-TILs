import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){ //몇 줄 출력할 것인가
            for(int j = 0; j < n-i; j++){ //가로로 몇 세트 출력할 것인가
                for(int z = 1; z < n-i; z++) //한 세트에 몇 개의 *을 출력할 것인가
                    System.out.print("*");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}