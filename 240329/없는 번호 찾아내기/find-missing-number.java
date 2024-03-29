import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        int[] number = new int[30];
        
        // 28개 정수 입력
        for(int i = 0; i < 28; i++){
            arr[i] = sc.nextInt();
        }

        // number 배열을 돌면서 숫자가 존재한다면 number[j] = 1 로 설정
        for(int i = 0; i < 28; i++){
            for(int j = 0; j < 30; j++){
                if(arr[i] == j+1)
                    number[j] = 1;
            }
        }

        for(int j = 0; j < 30; j++){
            if(number[j] == 0)
                System.out.println(j+1);
        }
    
    }
}