import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int from = d1, to = d2;
        String[] day = new String[]{ "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
    
        for(int i = 1; i < m1; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                from += 31;
            else if(i == 2)
                from += 28;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                from += 30;
        }

        for(int i = 1; i < m2; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                to += 31;
            else if(i == 2)
                to += 28;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                to += 30;
        }


        if(from > to)
            System.out.print(day[((to-from)%7)+7]);
        else
            System.out.print(day[(to-from)%7]);
    }
}