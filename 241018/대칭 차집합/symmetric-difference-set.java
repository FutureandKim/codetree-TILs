import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenA = sc.nextInt();
        int lenB = sc.nextInt();
        int[] arrayA = new int[lenA];
        int[] arrayB = new int[lenB];
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        for(int i = 0; i < lenA; i++){
            arrayA[i] = sc.nextInt();
            a.add(arrayA[i]);
        }

        for(int i = 0; i < lenB; i++){
            arrayB[i] = sc.nextInt();
            b.add(arrayB[i]);
        }

        HashSet<Integer> a_b = new HashSet<>();
        HashSet<Integer> b_a = new HashSet<>();

        for(int i = 0; i < lenA; i++){
            if(!b.contains(arrayA[i])){
                a_b.add(arrayA[i]);
            }
        }

        for(int i = 0; i < lenB; i++){
            if(!a.contains(arrayB[i])){
                b_a.add(arrayB[i]);
            }
        }

        System.out.print(a_b.size() +  b_a.size());
    }
}