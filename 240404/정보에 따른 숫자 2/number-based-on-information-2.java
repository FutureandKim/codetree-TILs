import java.util.Scanner;

public class Main {
    public static char[] loc = new char[1001]; // 알파벳 위치를 저장할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < t; i++){
            char c = sc.next().charAt(0);
            int n = sc.nextInt();
            loc[n] = c;
        }

        int cnt = 0;
        for(int i = a; i <= b; i++)
            cnt += isSpecialNum(i);
        System.out.print(cnt);
    }

    // n이 특별한 위치인지 찾는 함수
    public static int isSpecialNum(int n){
        int minD1 = Integer.MAX_VALUE;
        int minD2 = Integer.MAX_VALUE;

        for(int i = 0; i < 1001; i++){
            if(loc[i] == 'S')
                minD1 = Math.min(minD1, Math.abs(n-i));
            if(loc[i] == 'N')
                minD2 = Math.min(minD2, Math.abs(n-i));        
        }

        if(minD1 <= minD2)
            return 1;
        return 0;
    }
}