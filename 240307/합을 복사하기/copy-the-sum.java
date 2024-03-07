public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int hap = a + b + c;
        a = b = c = hap;
        System.out.printf("%d %d %d", a, b, c);
    }
}