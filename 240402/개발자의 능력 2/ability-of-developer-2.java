import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ab = new int[6];
        int[] group = new int[3]; // 팀별 능력 총합을 저장할 배열

        for(int i = 0; i < 6; i++)
            ab[i] = sc.nextInt();

        Arrays.sort(ab);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 3; i++){
            group[i] = ab[i] + ab[5-i];
            min = Math.min(group[i], min);
            max = Math.max(group[i], max);
        }
        System.out.print(max - min);
    }
}