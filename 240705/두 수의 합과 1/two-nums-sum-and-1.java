import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        String sumStr = Integer.toString(sum);

        int cnt = 0;
        for(int i = 0; i < sumStr.length(); i++){
            if(sumStr.charAt(i) == '1')
                cnt++;
        }
        System.out.print(cnt);
    }
}