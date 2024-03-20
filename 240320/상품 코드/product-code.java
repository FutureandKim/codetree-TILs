import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        Product p1 = new Product();
        Product p2 = new Product(str, n);

        System.out.printf("product %d is %s\n", p1.code, p1.name);
        System.out.printf("product %d is %s", p2.code, p2.name);
    }
}

class Product {
    String name;
    int code;

    public Product() {
        this.name = "codetree";
        this.code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}