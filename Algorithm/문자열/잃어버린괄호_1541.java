package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 잃어버린괄호_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String min[] = str.split("-");
        List<String[]> list = new ArrayList();
        int plus = 0;
        int minus = 0;

        for(int i = 0; i < min.length; i++){
            System.out.println(min[i]);
        }

        for(int i = 0; i < min.length; i++){
            if(min[i].contains("+")) list.add(min[i].split("\\+"));
            else minus += Integer.parseInt(min[i]);
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).length; j++){
                plus += Integer.parseInt(list.get(i)[j]);
            }
        }
        System.out.println(minus - plus);
    }
}
