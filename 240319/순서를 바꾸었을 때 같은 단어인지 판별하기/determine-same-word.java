import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        boolean same = false;

        Arrays.sort(c1);
        Arrays.sort(c2);

        String sortedS1 = new String(c1);
        String sortedS2 = new String(c2);

        if(sortedS1.length() > sortedS2.length()){
            if(sortedS1.contains(sortedS2))
                same = true;
        } else{
            if(sortedS2.contains(sortedS1))
                same = true;
        }
        System.out.print(same ? "Yes" : "No");
    }
}