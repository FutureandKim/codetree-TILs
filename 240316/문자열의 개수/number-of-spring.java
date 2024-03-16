import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, cnt = 0;
        String[] arr = new String[200];

        for(int i = 0; i < 200; i++){
            String str = sc.next();

            if(str.equals("0")){
                System.out.println(cnt);
                break;
            }

            if(i % 2 == 0){
                arr[even] = str;
                even++;
            }
            cnt++;
        }

        for(int i = 0; i < even; i++)
            System.out.println(arr[i]);
    }
}