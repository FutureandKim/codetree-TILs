import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            String str = sc.next();
            
            // END가 주어지면 작업종료
            if(str.equals("END")) 
                break;

            char[] arr = str.toCharArray();
            for(int j = 0; j < arr.length; j++)
                arr[j] = str.charAt(arr.length-1-j);
            System.out.println(arr);
        }
    }
}