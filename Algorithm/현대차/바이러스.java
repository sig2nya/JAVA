package 현대차;

import java.math.BigInteger;
import java.util.Scanner;

public class 바이러스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger K = new BigInteger(String.valueOf(sc.nextInt())); int P = sc.nextInt(); int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            K = K.multiply(new BigInteger(String.valueOf(P)));
            System.out.println(i + "번째 K : " + K);
        }
        System.out.println(K.mod(new BigInteger(String.valueOf(1000000007))));
    }
}
