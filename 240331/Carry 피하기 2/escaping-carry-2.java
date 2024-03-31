import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = n*(n-1)*(n-2)/3;
        int[] hap = new int[len]; // carry가 발생하지 않는 세 수의 합을 저장할 배열 
        int idx = 0; // 배열의 인덱스를 위한 변수

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            int n1 = 1, n2 = 1, n3 = 1; // 세 수를 선택하여 저장할 변수
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    n1 = arr[i];
                    n2 = arr[j];
                    n3 = arr[k];
                    while(true){
                        if((n1%10) + (n2%10) + (n3%10) >= 10) // carry가 발생하면
                            break;
                        else if(n1 == 0 && n2 == 0 && n3 == 0){ // 세 수의 몫이 모두 0이 된 경우 배열에 저장(= 끝까지 carry없음)
                            hap[idx++] = arr[i] + arr[j] + arr[k]; 
                            break;
                        }
                        n1 /= 10;
                        n2 /= 10;
                        n3 /= 10;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++)
            max = Math.max(max, hap[i]);
        
        // 모든 숫자쌍에서 carry 발생하면 -1 출력
        System.out.print(max == 0 ? -1 : max);
    }
}