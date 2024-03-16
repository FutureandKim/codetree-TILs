import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            int qnum = sc.nextInt();
            if(qnum == 1){
                str = str.substring(1) + str.substring(0, 1);
            } else if(qnum == 2){
                str = str.substring(str.length()-1) + str.substring(0, str.length()-1);
            } else {
                char[] arr = str.toCharArray();
                for(int j = 0; j < arr.length; j++)
                    arr[j] = str.charAt(arr.length-1-j);
                str = String.valueOf(arr);
            }
            System.out.println(str);
        }
    }
}