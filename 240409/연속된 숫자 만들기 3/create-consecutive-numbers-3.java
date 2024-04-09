import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] p = new BigInteger[3];
        BigInteger cnt = BigInteger.valueOf(0);

        for(int i = 0; i < 3; i++){
            p[i] = sc.nextBigInteger();
        }
/*
        if(p[1].subtract(p[2]).compareTo(p[2].subtract(p[1])) >= 0){
            while(true){
                if(p[0].add(BigInteger.ONE).equals(p[1]) && p[1].add(BigInteger.ONE).equals(p[2]))
                    break;
                p[2] = p[1].subtract(BigInteger.ONE);
                Arrays.sort(p);
                cnt = cnt.add(BigInteger.valueOf(1));
            }
        }   
        else {
            while(true){
                if(p[0].add(BigInteger.ONE).equals(p[1]) && p[1].add(BigInteger.ONE).equals(p[2]))
                    break;
                p[0] = p[1].add(BigInteger.ONE);
                Arrays.sort(p);
                cnt = cnt.add(BigInteger.valueOf(1));
            }
        }  
        */
        if(p[1].subtract(p[0]).compareTo(p[2].subtract(p[1])) >= 0)
            cnt = p[1].subtract(p[0]).subtract(BigInteger.ONE);
        else
            cnt = p[2].subtract(p[1]).subtract(BigInteger.ONE);
        System.out.print(cnt);

    }
}