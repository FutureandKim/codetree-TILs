import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble()/100;
        double weight = sc.nextDouble();
        int bmi = (int)(weight / (height * height));


        System.out.println(bmi);
        if(bmi >= 25)
            System.out.print("Obesity");

    }
}