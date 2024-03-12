import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double[] grade = new double[n];

        for(int i = 0; i < n; i++){
            grade[i] = sc.nextDouble();
            sum += grade[i];
        }

        double avg = sum / n;

        if(avg >= 4.0)
            System.out.printf("%.1f\nPerfect", avg);
        else if(avg >= 3.0)
            System.out.printf("%.1f\nGood", avg);
        else
            System.out.printf("%.1f\nPoor", avg);


    }
}