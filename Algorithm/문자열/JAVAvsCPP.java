package 문자열;

import java.util.Scanner;

public class JAVAvsCPP {
    public static boolean checkJAVA(String str){
        boolean result = false;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                result = true;
            } else if(str.charAt(i) == '_') {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

    }
}
