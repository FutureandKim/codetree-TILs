import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        int idx_a = -1, idx_b = 0;
        boolean res = true;

        for(int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        // 부분 수열의 시작점 찾기 위해 
        // b[0]이 배열 a의 몇번째 인덱스에 위치하는지 탐색
        for(int i = 0; i < n1; i++){
            if(a[i] == b[0]){
                idx_a = i;
                break;
            }
        }

        // 부분 수열이 될 수 없는 경우 우선 제외
        if(idx_a == -1 || (idx_a+n2) > n1){
            System.out.printf("No");
            res = false;
        }

        if(res == true) {
            for(int j = idx_a; j < (idx_a+n2); j++){
                //System.out.printf("%d %d\n", j, idx_b);
                if(a[j] != b[idx_b]){
                    System.out.print("No");
                    res = false;
                    break;
                }
                idx_b++;
                if(idx_b == n2-1)
                    break;
            }
        }
        if(res == true)
            System.out.print("Yes");
        sc.close();

    }
}