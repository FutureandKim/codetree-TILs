import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<int[]> segments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            segments.add(new int[]{x1, x2});
        }

        Collections.sort(segments, Comparator.comparingInt(a -> a[1]));

        int maxSegments = backtrack(segments, 0, 0, -1);
        System.out.println(maxSegments);
    }

    public static int backtrack(List<int[]> segments, int index, int count, int lastEnd) {
        if (index == segments.size()) {
            return count;
        }

        int maxCount = backtrack(segments, index + 1, count, lastEnd);

        if (segments.get(index)[0] > lastEnd) {
            maxCount = Math.max(maxCount, backtrack(segments, index + 1, count + 1, segments.get(index)[1]));
        }

        return maxCount;
    }
}