import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = -1;
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'e'){
                idx = i;
                break;
            }
        }

        System.out.print(str.substring(0, idx)+str.substring(idx+1));
        sc.close();
    }
}