import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 각 변의 숫자 개수
        int t = sc.nextInt(); // 회전 시간
        
        // 삼각형 각 변의 숫자 저장
        int[] left = new int[n];
        int[] right = new int[n];
        int[] bottom = new int[n];
        
        for (int i = 0; i < n; i++) {
            left[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            right[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        
        // t초 동안 회전
        for (int i = 0; i < t; i++) {
            rotate(left, right, bottom, n);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.print(bottom[i] + " ");
        }
    }
    
    // 삼각형 각 변 시계 방향 회전
    public static void rotate(int[] left, int[] right, int[] bottom, int n) {
        int tempLeftLast = left[n - 1];
        int tempRightLast = right[n - 1];
        int tempBottomLast = bottom[n - 1];
        
        // 아래쪽 -> 오른쪽
        for (int i = n - 1; i > 0; i--) {
            bottom[i] = bottom[i - 1];
        }
        bottom[0] = tempRightLast;
        
        // 오른쪽 -> 왼쪽
        for (int i = n - 1; i > 0; i--) {
            right[i] = right[i - 1];
        }
        right[0] = tempLeftLast;
        
        // 왼쪽 -> 아래쪽
        for (int i = n - 1; i > 0; i--) {
            left[i] = left[i - 1];
        }
        left[0] = tempBottomLast;
    }
}