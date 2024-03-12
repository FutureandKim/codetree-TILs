import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        // 원소 입력
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < q; i++){
            int qnum = sc.nextInt(); // 질의 번호
            int a = 0, b = 0;
            if(qnum == 1){
                a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if(qnum == 2){
                a = sc.nextInt();
                int cnt = -1;
                for(int j = 0; j < n; j++){
                    if(arr[j] == a){
                        cnt = j+1;
                        System.out.println(j+1);
                        break;
                    }
                }
                if(cnt == -1)
                    System.out.println(0);
            } else if(qnum == 3){
                a = sc.nextInt();
                b = sc.nextInt();
                for(int j = a-1; j <= b; j++)
                    System.out.printf("%d ", arr[j]);
            }
        }
        sc.close();
    }
}