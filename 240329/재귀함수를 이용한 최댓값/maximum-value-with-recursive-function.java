import java.util.Scanner;

public class Main {
    public static int[] numArr;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        numArr = new int[n];

        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();
        
        int max = maxNum(0);
        System.out.print(max);
    }

    public static int maxNum(int idx){
        if(idx == n-1)
            return numArr[idx];
        return Math.max(numArr[idx], maxNum(idx+1));
    }
}