import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;

        for(int i = x; i <= y; i++)
            cnt += isPalindrome(i);
        System.out.print(cnt);
    }

    public static int isPalindrome(int n){
        String s = Integer.toString(n);
        int len = s.length();
        int[] arr = new int[len];
        boolean isPalin = true;

        for(int i = 0; i < len; i++){
            arr[i] = n%10;
            n /= 10;
        }

        for(int i = 0; i < len/2; i++){
            if(arr[i] != arr[len-i-1]){
                isPalin = false;
                break;
            }
        }

        if(!isPalin)
            return 0;
        return 1;
    }
}