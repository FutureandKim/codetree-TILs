import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                for(int j = 0; j < i; j++)
                    System.out.printf("%d ", arr[(i-1)-j]);
                break;
            }
        }
    }
}