import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.print(palindrome(s)? "Yes": "No");
    }

    // palindrome 판별
    public static boolean palindrome(String str) {
        char[] c_arr = str.toCharArray();
        int len = c_arr.length;
        for(int i = 0; i < c_arr.length/2; i++){
            if(c_arr[i] != c_arr[len-1-i])
                return false;
        }
        return true;
    }
}