import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = str.length()-1-i;
            System.out.print(str.charAt(num));
            if(num == 0)
                break;
        }
    }
}