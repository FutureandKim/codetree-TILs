import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int idx = -1;

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                idx = i;
                break;
            }
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < idx; i++){
            if(arr[i] > max)
                max = arr[i];
            
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.printf("%d %d", max, min);
        sc.close();
    }
}