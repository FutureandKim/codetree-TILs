import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            commandProcessing(str);
        }
    }

    public static void commandProcessing(String str){
        if(str.equals("push_back")){
            int num = sc.nextInt();
            arr.add(num);
        }
        else if(str.equals("pop_back"))
            arr.remove(arr.size()-1);
        else if(str.equals("size"))
            System.out.println(arr.size());
        else if(str.equals("get")){
            int num = sc.nextInt();
            System.out.println(arr.get(num-1));
        }
    }
}