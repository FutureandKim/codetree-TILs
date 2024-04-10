import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        char[][] arr = new char[10][10];
        int bi = 0, bj = 0;
        int ri = 0, rj = 0;
        int li = 0, lj = 0;
        int len = 0;

        for(int i = 0; i < 10; i++)
            str[i] = sc.next();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                arr[i][j] = str[i].charAt(j);
                if(arr[i][j] == 'B'){
                    bi = i;
                    bj = j;
                }
                else if(arr[i][j] == 'R'){
                    ri = i;
                    rj = j;
                }
                else if(arr[i][j] == 'L'){
                    li = i;
                    lj = j;
                }
            }
        }

        

        if(bi == ri && ri == li)
            len = Math.abs(lj - bj) + 1 + 3;
        else if(bj == rj && rj == lj)
            len = Math.abs(li - bi) + 1 + 3;
        else 
            len = Math.abs(lj - bj) + Math.abs(li - bi) - 1;
        System.out.print(len);

    }
}