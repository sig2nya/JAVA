package 문자열;

import java.util.Scanner;

public class SunlinSong_21964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int a = Integer.parseInt(sc.nextLine());
        String last = sc.nextLine();
        for(int i = a - 5; i < a; i++){
            result += last.charAt(i);
        }
        System.out.println(result);
    }
}
