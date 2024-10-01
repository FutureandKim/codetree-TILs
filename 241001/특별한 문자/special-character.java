import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        HashMap<Character, Integer> charHash = new HashMap<>();

        for(int i = 0; i < strLen; i++){
            charHash.put(str.charAt(i), charHash.getOrDefault(str.charAt(i), 0) + 1);
        }

        boolean foundChar = false;
        for(char c : charHash.keySet()){
            if(charHash.get(c) == 1){
                System.out.print(c);
                foundChar = true;
                break;
            }
        }

        if(!foundChar) {
            System.out.print("None");
        }
    }
}