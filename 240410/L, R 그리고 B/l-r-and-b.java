import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        int bi = 0, bj = 0;
        int ri = 0, rj = 0;
        int li = 0, lj = 0;
        int len = 0;

        for(int i = 0; i < 10; i++)
            str[i] = sc.next();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(str[i].charAt(j) == 'B'){
                    bi = i;
                    bj = j;
                }
                else if(str[i].charAt(j) == 'R'){
                    ri = i;
                    rj = j;
                }
                else if(str[i].charAt(j) == 'L'){
                    li = i;
                    lj = j;
                }
            }
        }

        if(bi == ri && ri == li && ((bj < rj && rj < lj) || (lj < rj && rj < bj))){
            len = Math.abs(lj - bj) + 1;
        }
        else if(bj == rj && rj == lj && ((bi < ri && ri < li) || (li < ri && ri < bi)))
            len = Math.abs(li - bi) + 1;
        else 
            len = Math.abs(lj - bj) + Math.abs(li - bi) - 1;
        System.out.print(len);

    }
}