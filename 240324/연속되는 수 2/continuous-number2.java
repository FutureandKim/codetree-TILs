import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n]; // N개의 숫자 배열
        int[] cont = new int[n]; // 연속하는 숫자 횟수 배열
        int cnt = 1, idx = 0;

        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();

        if(n == 1)
            cont[0] = 1;
        else{
            for(int i = 1; i < n; i++){
                if(numArr[i] == numArr[i-1])
                    cnt++;
                if(i == n-1 || numArr[i] != numArr[i-1]){
                    cont[idx++] = cnt;
                    cnt = 1;
                }
            }
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            if(cont[i] > max) 
                max = cont[i];
        }
        System.out.print(max);
    }
}