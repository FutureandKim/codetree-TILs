import java.util.Scanner;

public class Main {

    // 아름다운 수의 개수를 카운트하는 함수
    static int countBeautifulNumbers(int n) {
        return count(0, n);
    }

    // 재귀적으로 숫자를 세는 함수
    static int count(int length, int n) {
        if (length == n) {
            // 길이가 n이면 아름다운 수 하나를 찾은 것
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= 4; i++) {
            int repeat = i;  // 해당 숫자의 반복 횟수는 그 숫자 값과 동일
            if (length + repeat <= n) {
                // 재귀적으로 해당 숫자를 추가하고 남은 자리에서 아름다운 수를 찾음
                count += count(length + repeat, n);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countBeautifulNumbers(n));
    }
}
