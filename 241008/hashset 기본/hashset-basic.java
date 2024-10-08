import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("add")){
                int num = sc.nextInt();
                hashSet.add(num);

            } else if(str.equals("remove")){
                int num = sc.nextInt();
                hashSet.remove(num);

            } else if(str.equals("find")){
                int num = sc.nextInt();
                boolean isContain = hashSet.contains(num) ? true : false;
                System.out.println(isContain);
            }
        }

    }
}