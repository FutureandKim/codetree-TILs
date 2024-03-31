import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = n*(n-1)*(n-2)/3;
        int[] hap = new int[len];
        int idx = 0;

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            int n1 = 1;
            int n2 = 1; 
            int n3 = 1;
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    n1 = arr[i];
                    n2 = arr[j];
                    n3 = arr[k];
                    while(true){
                        if((n1%10) + (n2%10) + (n3%10) >= 10)
                            break;
                        else if(n1 == 0 && n2 == 0 && n3 == 0){
                            hap[idx++] = arr[i] + arr[j] + arr[k];
                            break;
                        }
                        n1 /= 10;
                        n2 /= 10;
                        n3 /= 10;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++)
            max = Math.max(max, hap[i]);
        System.out.print(max);
    }
}