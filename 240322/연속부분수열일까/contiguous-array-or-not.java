import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        String a_str = "", b_str = "";

        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        // 수열을 문자열로 변경
        for(int i = 0; i < n1; i++)
            a_str += a[i];
        for(int i = 0; i < n2; i++)
            b_str += b[i];

        if(a_str.contains(b_str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}