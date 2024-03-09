import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sym_1 = sc.next().charAt(0);
        int temp_1 = sc.nextInt();
        char sym_2 = sc.next().charAt(0);
        int temp_2 = sc.nextInt();
        char sym_3 = sc.next().charAt(0);
        int temp_3 = sc.nextInt();

        if(sym_1 == 'Y' && temp_1 >= 37)
            if((sym_2 == 'Y' && temp_2 >= 37) || (sym_3 =='Y' && temp_3 >= 37))
                System.out.print('E');
            else
                System.out.print('N');
        else if((sym_2 == 'Y' && temp_2 >= 37) && (sym_3 =='Y' && temp_3 >= 37))
            System.out.print('E');
        else
            System.out.print('N');
    }
}