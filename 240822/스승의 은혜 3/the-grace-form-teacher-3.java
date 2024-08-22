import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int[] s = new int[n];

        // 가격, 배송비 입력
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int maxNum = 0;

        for(int i = 0; i < n; i++){
            
            int[] totalCost = new int[n];
            for(int j = 0; j < n; j++){
                if(j == i)
                    totalCost[j] = ((p[j]/2) + s[j]); // i번째 선물 반값
                else 
                    totalCost[j] = (p[j] + s[j]);
            }

            Arrays.sort(totalCost); // (선물 + 배송비) 적은 순 정렬 → 더 많은 학생 선물 사줄 수 있으니까

            int priceNow = 0;
            int studentCnt = 0;

            for(int cost : totalCost){
                if(priceNow + cost < b){
                    priceNow += cost;
                    studentCnt++;
                }
                else break;
            }
            maxNum = Math.max(maxNum, studentCnt);
        }

        System.out.print(maxNum);

    }
}