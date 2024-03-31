import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        char[] people = new char[10001];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            char c = sc.next().charAt(0);
            people[num-1] = c;
        }

        for(int i = 0; i < 10001-k; i++){
            int hap = 0;
            for(int j = i; j <= i+k; j++){
                if(people[j] == 'G')
                    hap+=1;
                else if(people[j] == 'H')
                    hap+=2;
            }
            max = Math.max(max, hap);
        }
        System.out.print(max);
    }
}