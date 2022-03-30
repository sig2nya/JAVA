import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static String solution(String a, String b){
        String answer = "";
        long x = Integer.parseInt(a), y = Integer.parseInt(b);
        answer = Long.toString(x + y);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("1234", "5678"));
    }
}
