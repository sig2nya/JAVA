package 프로그래머스.lv1;

public class 이상한문자열만들기 {
    public static String solution(String s){
        String answer = "";
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))) {
                answer += " ";
                flag = 0;
                continue;
            }
            if(flag % 2 == 0) {
                answer += Character.toUpperCase(s.charAt(i));
                flag++;
            } else {
                answer += Character.toLowerCase(s.charAt(i));
                flag++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try  hello world"));
    }
}
