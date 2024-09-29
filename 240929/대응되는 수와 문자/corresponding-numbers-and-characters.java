import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> strHash = new HashMap<>();
        HashMap<Integer, String> intHash = new HashMap<>();

        for(int i = 1; i <= n; i++){
            String str = sc.next();
            strHash.put(str, i);
            intHash.put(i, str);
        }

        for(int i = 0; i < m; i++){
            String input = sc.next();
            if(isNumber(input)){
                int inputNum = Integer.parseInt(input);
                System.out.println(intHash.get(inputNum));
            } else {
                System.out.println(strHash.get(input));
            }
        }
    }

    public static boolean isNumber(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}