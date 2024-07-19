import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        //블록 입력
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            arr.add(b);
        }

        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr = removeBlock(arr, s1, e1);

        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        ArrayList<Integer> newArr2 = new ArrayList<>();
        newArr2 = removeBlock(newArr, s2, e2);

        System.out.println(newArr2.size());
        for(int i = 0; i < newArr2.size(); i++)
            System.out.println(newArr2.get(i));
    }

    //블록 제거하는 함수
    public static ArrayList<Integer> removeBlock(ArrayList<Integer> arr, int s, int e){
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            if(i < s-1 || i >= e)
                newArr.add(arr.get(i));
        }

        return newArr;
    }
}