import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int engA = sc.nextInt();
        int mathB = sc.nextInt();
        int engB = sc.nextInt();

        if(mathA > mathB)
            System.out.print("A");
        else if (mathB > mathA)
            System.out.print("B");
        else if (engA > engB)
            System.out.print("A");
        else  
            System.out.print("B");
    }
}