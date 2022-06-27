package 문자열;

import java.util.Scanner;

public class 이문제는D2입니다_23303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String d2[] = {"D2", "d2"};

        if(str.contains("D2") || str.contains("d2")) System.out.println("D2");
        else System.out.println("unrated");
    }
}
