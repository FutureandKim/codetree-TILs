import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int[] len = new int[]{ s1.length(), s2.length(), s3.length() };

        int max = len[0];
        int min = len[0];
        for(int i = 1; i < 3; i++){
            if(max < len[i])
                max = len[i];
            if(min > len[i])
                min = len[i];
        }
        System.out.print(max - min);
        sc.close();
    }
}