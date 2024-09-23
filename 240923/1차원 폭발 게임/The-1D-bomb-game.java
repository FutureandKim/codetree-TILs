import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 폭탄의 개수
        int M = sc.nextInt();  // 연속 폭발 기준

        Stack<int[]> stack = new Stack<>();
        
        // 숫자 입력과 동시에 폭발 여부 처리
        for (int i = 0; i < N; i++) {
            int current = sc.nextInt();

            // 스택이 비어 있지 않고, 현재 숫자가 스택의 맨 위 숫자와 같으면 연속 개수 증가
            if (!stack.isEmpty() && stack.peek()[0] == current) {
                stack.peek()[1]++;  // 연속된 숫자 카운팅
            } else {
                // 새로운 숫자가 나오면 스택에 추가
                stack.push(new int[]{current, 1});
            }

            // 연속된 숫자가 M개 이상이면 스택에서 제거
            if (stack.peek()[1] >= M) {
                stack.pop();  // 해당 숫자 전부 제거
            }
        }

        // 최종 남은 폭탄 결과를 처리
        Stack<Integer> resultStack = new Stack<>();
        while (!stack.isEmpty()) {
            int[] pair = stack.pop();
            for (int i = 0; i < pair[1]; i++) {
                resultStack.push(pair[0]);  // 남아있는 숫자를 다시 넣어줌
            }
        }

        // 출력: 결과 스택에서 숫자를 다시 출력
        System.out.println(resultStack.size());
        while (!resultStack.isEmpty()) {
            System.out.println(resultStack.pop());
        }
    }
}