package bruteforce;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Divisor_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int K = sc.nextInt();
        List<Integer> list = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                list.add(i);
            }
        }
        try{
            System.out.println(list.get(K - 1));
        } catch (Exception e){
            System.out.println(0);
        }

    }
}