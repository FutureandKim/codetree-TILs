import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> bombArr = new ArrayList<Integer>();

        int idx = 0;
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            if(idx > 0) {
                if(bombArr.get(idx) != b){
                    bombArr.add(b);
                    idx++;
                }
                else
                    bombArr.remove(idx);
            }
        }

        System.out.println(bombArr.size());
        for(int bomb : bombArr)
            System.out.println(bomb);
    }
}