package math;


import java.math.BigInteger;
import java.util.Scanner;

public class 큰수_10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
    }
}
