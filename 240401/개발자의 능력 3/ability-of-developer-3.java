import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[6];
        int sum = 0; // 6명 전체의 능력 총합
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 6; i++){
            ab[i] = sc.nextInt();
            sum += ab[i];
        }

        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 5; j++){
                for(int k = 2; k < 6; k++){
                    int partSum = ab[i] + ab[j] + ab[k];
                    int otherSum = sum - partSum;
                    int sub = Math.abs(otherSum - partSum);
                    min = Math.min(min, sub);
                }
            }
        }
        System.out.print(min);
    }
}