import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String n_str = Integer.toString(n);
        int[] binaryArr = new int[n_str.length()]; // 2진수 저장할 배열

        for(int i = binaryArr.length-1; i >= 0; i--){
            binaryArr[i] = n%10;
            n /= 10;
        }

        // 10진수 변환
        int decimalNum = 0;
        for(int i = 0; i < binaryArr.length; i++){
            decimalNum = decimalNum * 2 + binaryArr[i];
        }
        decimalNum *= 17;
        
        // 2진수 변환
        int[] digit = new int[50];
        int cnt = 0;
        while (true) {
            if(decimalNum < 2){
                digit[cnt++] = decimalNum;
                break;
            }

            digit[cnt++] = decimalNum % 2;
            decimalNum /= 2;
        }

        for(int i = cnt-1; i >= 0; i--)
            System.out.print(digit[i]);

    }
}