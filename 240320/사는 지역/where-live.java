import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Address[] a = new Address[n];
        String[] nameList = new String[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            a[i] = new Address(name, addr, city);
            nameList[i] = name;
        }

        Arrays.sort(nameList);
        for(int i = 0; i < n; i++)
            if(nameList[n-1] == a[i].name){
                System.out.printf("name %s\naddr %s\ncity %s", a[i].name, a[i].addr, a[i].city);
                break;
            }
    }
}

class Address {
    String name, addr, city;

    public Address(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}