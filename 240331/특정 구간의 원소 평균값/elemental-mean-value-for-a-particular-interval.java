import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE, z, cnt = 0;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int avg = 0;
                boolean isSame = false;
                for(z = i; z <= j; z++){
                    avg += arr[z];
                }
                avg /= z;
                
                for(int k = i; k <= j; k++){
                    if(avg == arr[k])
                        isSame = true;
                }

                if(isSame)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}