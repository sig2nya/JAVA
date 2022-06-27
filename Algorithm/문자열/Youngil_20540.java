package 문자열;

import java.util.Scanner;

public class Youngil_20540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti = sc.nextLine();
        String result = "";
        if(mbti.charAt(0) == 'E') result += 'I';
        else result += 'E';
        if(mbti.charAt(1) == 'S') result += 'N';
        else result += 'S';
        if(mbti.charAt(2) == 'T') result += 'F';
        else result += 'T';
        if(mbti.charAt(3) == 'J') result += 'P';
        else result += 'J';
        System.out.println(result);
    }
}
