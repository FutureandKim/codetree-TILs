import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        int[] number = new int[30];
        
        for(int i = 0; i < 28; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 28; i++){
            for(int j = 0; j < 30; j++){
                if(arr[i] == j+1)
                    number[j] = 1;
            }
        }

        for(int j = 0; j < 30; j++){
            if(number[j] == 0)
                System.out.println(j+1);
        }

    
    }
}