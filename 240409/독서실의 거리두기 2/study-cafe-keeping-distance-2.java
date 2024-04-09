import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] seat = new int[n];
        int len = 0, maxLen = 0;
        int minLen = 10000;

        for(int i = 0; i < n; i++)
            seat[i] = str.charAt(i);

        // 기존 사용자 사이의 거리의 최소값 구하기
        for(int i = 0; i < n; i++){
            if(seat[i] == '0')
                continue;
            else if(seat[i] == '1'){
                for(int j = i+1; j < n; j++){
                    if(seat[j] == '1')
                        minLen = Math.min(j - i, minLen);
                }
            }
        }
        //System.out.println(minLen);
        
        for(int i = 0; i < n; i++){
            if(seat[i] == '1')
                continue;
            else{
                int left = 0, right = 0;
                // seat[i]보다 왼쪽에 있는 가장 가까운 1
                for(int j = i-1; j >= 0; j--){
                    if(seat[j] == '1'){
                        left = i - j;
                        break;
                    }
                }
                // seat[i]보다 오른쪽에 있는 가장 가까운 1
                for(int j = i+1; j < n; j++){
                    if(seat[j] == '1'){
                        right = j - i;
                        break;
                    }
                }
                if(i == 0)
                    left = Integer.MAX_VALUE;
                if(i == n - 1)
                    right = Integer.MAX_VALUE;

                // 가까운 거리 선택
                //System.out.printf("%d: %d %d\n", i, left, right);
                len = Math.min(left, right);
            }
            // 가장 가까운 두 사람의 거리의 최대값
            maxLen = Math.max(maxLen, len);
        }

        maxLen = Math.min(maxLen, minLen);
        System.out.print(maxLen);
    }
}