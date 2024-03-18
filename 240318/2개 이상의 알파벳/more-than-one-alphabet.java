import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(alphabetNum(str)? "Yes" : "No");
    }

    // 알파벳 수 판단 함수
    public static boolean alphabetNum(String str) {
        int[] alphabet = new int[26];

        // 문자열을 돌면서 알파벳의 개수 count
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                alphabet[(int)str.charAt(i)-97]++;
            }
        }

        for(int i = 0; i < 26; i++){
            if(i > 1)
                return true;
        }
        return false;
    }
}