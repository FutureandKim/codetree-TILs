import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) {
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                String str = sc.next();
                Order(str);
            }
    }

    public static void Order(String str){
        if(str.equals("push_back")){
            int n = sc.nextInt();
            al.add(n);
        }
        else if(str.equals("get")){
            int n = sc.nextInt();
            System.out.println(al.get(n-1));
        }
        else if(str.equals("size")){
            System.out.println(al.size());
        }
        else if(str.equals("pop_back")){
            al.remove(al.size()-1);
        }
    }
}