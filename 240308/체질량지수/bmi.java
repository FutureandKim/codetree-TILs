import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();
        double bmi = (double)((weight*100*100)/(height*height));


        System.out.println((int)bmi);
        if(bmi >= 25)
            System.out.print("Obesity");

    }
}