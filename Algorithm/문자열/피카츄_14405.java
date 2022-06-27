package 문자열;

import java.util.Scanner;

public class 피카츄_14405 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "YES";
        int i = 0;
        while(i < str.length()){
            if(i + 1 < str.length() && str.charAt(i) == 'p' && str.charAt(i + 1) == 'i'){
                i += 2;
            } else if(i + 1 < str.length() && str.charAt(i) == 'k' && str.charAt(i + 1) == 'a'){
                i += 2;
            } else if(i + 2 < str.length() && str.charAt(i) == 'c' && str.charAt(i + 1) == 'h' && str.charAt(i + 2) == 'u'){
                i += 3;
            } else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);*/

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str.replaceAll("pi|ka|chu", "");
        if(str.equals("")) System.out.println("YES");
        else System.out.println("NO");
    }
}
