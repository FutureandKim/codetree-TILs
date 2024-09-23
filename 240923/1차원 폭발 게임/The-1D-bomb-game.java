import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> bombList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bombList.add(sc.nextInt());
        }

        boolean exploded;
        do {
            exploded = false;
            ArrayList<Integer> tempList = new ArrayList<>();
            int i = 0;

            while (i < bombList.size()) {
                int current = bombList.get(i);
                int count = 1;
                int j = i + 1;

                while (j < bombList.size() && bombList.get(j) == current) {
                    count++;
                    j++;
                }

                if (count >= m) {
                    exploded = true; // 폭발 발생
                } else {
                    for (int k = i; k < j; k++) {
                        tempList.add(bombList.get(k));
                    }
                }

                i = j; // 다음 그룹으로 이동
            }

            bombList = tempList; // 남은 폭탄 리스트 업데이트

        } while (exploded); // 더 이상 폭발이 없을 때까지 반복

        System.out.println(bombList.size());
        for (int num : bombList) {
            System.out.println(num);
        }
    }
}