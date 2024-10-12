import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(!hashSet.contains(num)){
                hashSet.add(num);
            }
        }

        System.out.print(hashSet.size());
    }
}