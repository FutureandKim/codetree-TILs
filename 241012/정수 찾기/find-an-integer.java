import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        int aLen = sc.nextInt();
        for(int i = 0; i < aLen; i++){
            int num = sc.nextInt();
            a.add(num);
        }

        int bLen = sc.nextInt();
        for(int i = 0; i < bLen; i++){
            int num = sc.nextInt();
            System.out.println(a.contains(num) ? 1 : 0);
        }
    }
}