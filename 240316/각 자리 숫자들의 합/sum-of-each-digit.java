import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int hap = 0;

        for(int i = 0; i < s.length(); i++){
            int num = (int)s.charAt(i)-48;
            hap += num;
        }
        System.out.print(hap);
    }
}