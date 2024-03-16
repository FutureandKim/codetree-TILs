import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String lr = sc.next();
        char[] arr = lr.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'L')
                str = str.substring(1) + str.substring(0, 1);
            else if(arr[i] == 'R')
                str = str.substring(str.length()-1) + str.substring(0, str.length()-1);
        }
        System.out.print(str);
    }
}