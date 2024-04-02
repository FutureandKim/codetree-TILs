import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int cnt = 0;
        int len1 = s1.length(), len2 = s2.length();
        boolean isExist = true;

        if(!s1.contains(s2))
            isExist = false;
        else {
            for(int i = 0; i < len1-len2+1; i++){
                // s1의 i번째와 s2의 첫번째 문자가 일치하는지 확인
                if(s1.charAt(i) == s2.charAt(0)){
                    int idx = 0;
                    for(int j = i; j < i+len2; j++){
                        if(s1.charAt(j) != s2.charAt(idx)) 
                            break;
                        if(j == i+len2-1 && (s1.charAt(j) == s2.charAt(len2-1))){
                            cnt = i;
                            break;
                        }
                        idx++;
                    }
                }
                if(cnt != 0)
                    break;
            }
        }

        System.out.print(isExist ? cnt : -1);
    }
}