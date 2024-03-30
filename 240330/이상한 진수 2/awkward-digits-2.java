import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] arr = new int[a.length()];
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(c == '1')
                c = '0';
            else if(c == '0')
                c = '1';

            String binary = a.substring(0, i) + c + a.substring(i+1); 
            arr[i] = Integer.parseInt(binary, 2);
        }

        for(int i = 0; i < a.length(); i++)
            res = Math.max(res, arr[i]);
        System.out.print(res);
    }
}