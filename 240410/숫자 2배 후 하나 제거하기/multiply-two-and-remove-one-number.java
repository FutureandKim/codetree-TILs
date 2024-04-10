import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n]; 
        int[] num2 = new int[n-1]; // (n-1)개 숫자 저장할 배열
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt();

        for(int k = 0; k < n; k++){
            num[k] *= 2;

            // 숫자 1개 제외하고 num2 배열에 저장
            for(int i = 0; i < n; i++){
                int idx = 0, sum = 0;
                for(int j = 0; j < n; j++){
                    int cnt = i;
                    if(cnt == j)
                        continue;
                    else
                        num2[idx++] = num[j];
                }

                for(int j = 1; j < n-1; j++)
                    sum += Math.abs(num2[j] - num2[j-1]);
                min = Math.min(sum, min);
            }

            num[k] /= 2; // 배열 원상복구
        }
        System.out.print(min);
    }
}