import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int idx = 0;

        for(int i = 0; i < 200; i++){
            arr[i] = sc.next();
            if(arr[i].equals("0")){
                idx = i;
                break;
            }
        }

        System.out.println(idx);
        for(int i = 0; i < idx; i+=2)
            System.out.println(arr[i]);
    }
}