import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i;

        for(i = 0; i < 100; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0)
                break;
        }

        for(int k = 10; k >= 1; k--){
            int cnt = 0;
            for(int j = 0; j < i; j++){
                if(a[j]/10 == k)
                    cnt++; 
            }
            System.out.printf("%d - %d\n", k*10, cnt);
        }

    }
}