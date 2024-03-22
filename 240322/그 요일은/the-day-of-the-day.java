import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String aDay = sc.next();
        int from = d1, to = d2;
        String[] days = new String[]{ "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
        int idx = 0;
    
        for(int i = 1; i < m1; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                from += 31;
            else if(i == 2)
                from += 29;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                from += 30;
        }

        for(int i = 1; i < m2; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                to += 31;
            else if(i == 2)
                to += 29;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                to += 30;
        }

        // A요일의 idx 찾기
        for(int i = 0; i < 7; i++){
            if(days[i].equals(aDay))
                idx = i;
        }

        if((to-from)%7 < idx)
            System.out.print((to-from)/7);
        else
            System.out.print((to-from)/7 + 1);
    }
}