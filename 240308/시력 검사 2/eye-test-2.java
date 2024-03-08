import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sight = sc.nextDouble();

        if(sight >= 1.0)
            System.out.print("High");
        else if(sight >= 0.5)
            System.out.print("Middle");
        else
            System.out.print("Low");

    }
}