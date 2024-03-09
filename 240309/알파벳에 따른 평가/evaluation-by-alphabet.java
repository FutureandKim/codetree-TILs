import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c == 'S')
            System.out.print("Superior");
        else if(c == 'A')
            System.out.print("Excellent");
        else if(c == 'B')
            System.out.print("Good");
        else if(c == 'C')
            System.out.print("Usually");
        else if(c == 'D')
            System.out.print("Effort");
        else   
            System.out.print("Failure");
    }
}