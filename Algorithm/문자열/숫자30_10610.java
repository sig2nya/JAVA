package 문자열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 숫자30_10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i)-'0';
            list.add(str.charAt(i)-'0');
        }

        Collections.sort(list);
        if(list.get(0) == 0 && sum % 3 == 0){
            for(int i = list.size() - 1; i >= 0; i--){
                System.out.print(list.get(i));
            }
        } else System.out.println(-1);
    }
}
