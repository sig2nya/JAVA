package 수학;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNums_2581 {
    public static boolean finding(int num){
        if(num == 1) return false;
        int check = 0;
        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                check++;
            } else{
                continue;
            }
        }
        // System.out.println(check);
        if(check == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = N; i <= M; i++){
            if(finding(i)) list.add(i);
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        if(list.size() == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
