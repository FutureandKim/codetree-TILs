import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Stack<int[]> bombStack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(!bombStack.isEmpty() && bombStack.peek()[0] == num){
                bombStack.peek()[1]++;
            } else{
                bombStack.push(new int[]{num, 1});
            }

            if(bombStack.peek()[1] >= m){
                bombStack.pop();
            }
        }

        Stack<Integer> resStack = new Stack<>();
        while(!bombStack.isEmpty()){
            int[] pair = bombStack.pop();
            for(int i = 0; i < pair[1]; i++)
                resStack.push(pair[0]);
        }

        System.out.println(resStack.size());
        while(!resStack.isEmpty())
            System.out.println(resStack.pop());
    }
}