import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a/b == 0){
            System.out.print("0.");
            for(int i = 0; i< 20; i++){
                System.out.print((a*10)/b);
                a = (a*10) % b;
            }
        } else{
            for(int i = 0; i < 20; i++){
                if (i == 0) 
                    System.out.printf("%d.", (a*10)/b);
                else{
                    System.out.print((a*10)/b);
                }
                a = (a*10) % b;
            }
        }


    }
}