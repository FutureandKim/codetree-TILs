import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char first = arr[0], second = arr[1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == first)
                arr[i] = second;
            else if(arr[i] == second)
                arr[i] = first;
        }

        String res = String.valueOf(arr);
        System.out.print(res);
    }
}