import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[3];
        int cnt = 0;

        for(int i = 0; i < 3; i++)
            p[i] = sc.nextInt();

        if(p[1]-p[0] >= p[2]-p[1]){
            while(true){
                if(p[0] + 1 == p[1] && p[1] + 1 == p[2])
                    break;
                p[2] = p[1] - 1;
                Arrays.sort(p);
                cnt++;
            }
        }      
        else {
            while(true){
                if(p[0] + 1 == p[1] && p[1] + 1 == p[2])
                    break;
                p[0] = p[1] + 1;
                Arrays.sort(p);
                cnt++;
            }
        }  
        System.out.print(cnt);

    }
}