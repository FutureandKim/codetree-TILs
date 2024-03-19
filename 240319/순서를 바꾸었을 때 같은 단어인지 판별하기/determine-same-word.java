import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        boolean same = true;

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++){
            if(c1[i] != c2[i]){
                same = false;
                break;
            }
        }
        System.out.print(same ? "Yes" : "No");
    }
}