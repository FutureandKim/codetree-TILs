import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, cnt = 0; // 체온, 진료소 A로 가는 인원
        char s; // 증상
        int[] c = new int[3];


        for(int i = 0; i < 3; i++){
            s = sc.next().charAt(0);
            t = sc.nextInt();

            if(s == 'Y'){ // 각 진료소(A-B-C-D) 숫자(1-2-3-4)로 구분
                if(t >= 37){
                    c[i] = 1; 
                    cnt++; 
                }
                else
                    c[i] = 3;
            } else {
                if(t >= 37)
                    c[i] = 2;
                else c[i] = 4;
            }
        }

        for(int i = 1; i <= 4; i++){ // 진료소 기준 for문
            int num = 0;
            for(int j = 0; j < 3; j++){ // 각 환자들이 어디 진료소에 배정되었는지에 대한 for문
                if(c[j] == i)
                    num++;
            }
            System.out.printf("%d ", num);
        }

        if(cnt >= 2)
            System.out.print('E');
    }
}