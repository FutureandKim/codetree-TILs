import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int idx = -1;
        boolean res = true;

        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        for(int i = 0; i < n1; i++){
            if(a[i] == b[0]){
                idx = i;
                break;
            }
        }


        for(int j = idx; j < (idx+n2); j++){
            if(idx == -1){
                System.out.printf("No");
                res = false;
                break;
            }
            if(a[j] != b[j-idx]){
                System.out.print("No");
                res = false;
                break;
            }
        }
        if(res == true)
            System.out.print("Yes");
        sc.close();

    }
}