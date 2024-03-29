import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        
        for(int i = 0; i < 28; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i < 27; i++){
            if(arr[i+1] - arr[i] != 1)
                System.out.println(arr[i] + 1);
        }
    }
}