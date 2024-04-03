import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;

        for(int i = x; i <= y; i++){
            //System.out.println(i + " " +interestedNum(i));    
            cnt+=interestedNum(i);
        }
        System.out.println(cnt);
        
    }

    public static int interestedNum(int n){
        int origin = n;
        int cnt = 0, zeroNum = 0;
        int[] num = new int[10];

        while(true){
            if(n == 0)
                break;
            
            num[n%10]++;
            n/=10;
        }

        for(int i = 0; i < 10; i++){
            if(num[i] > 1)
                cnt++;
        }

        // 전부 같은 숫자로만 이루어진 경우 제외
        for(int i = 0; i < 10; i++){
            if(num[i] == 0)
                zeroNum++;
        }
        if(zeroNum == 9)
            cnt = 0;

        if(cnt == 1)
            return 1;
        return 0;
    }
}