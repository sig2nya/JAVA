package 현대차.lv2;

import java.util.Scanner;

public class 전광판 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean zero[] = {true, true, true, true, true, true, false};
        boolean one[] = {false, true, true, false, false ,false, false};
        boolean two[] = {true, true, false, true, true, false, true};
        boolean three[] = {true, true, true, true, false, false, true};
        boolean four[] = {false, true, true, false, false, true, true};
        boolean five[] = {true, false, true, true, false, true, true};
        boolean six[] = {true, false, true, true, true, true, true};
        boolean seven[] = {true, true, true, false, false, true, false};
        boolean eight[] = {true, true, true, true, true, true, true};
        boolean nine[] = {true, true, true, false, false, true, true};

        int a = sc.nextInt(), b = sc.nextInt();
        int check = 0;
        do{
            int tmp1 = a % 10, tmp2 = b % 10;

            a /= 10; b /= 10;
        } while(check != 0);



    }
}
