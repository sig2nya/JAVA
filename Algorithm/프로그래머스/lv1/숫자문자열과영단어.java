package 프로그래머스.lv1;

public class 숫자문자열과영단어 {
    public static int solution(String s) {
        int answer = 0;
        String list[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < list.length; i++) {
            switch (list[i]) {
                case "zero" : s = s.replaceAll(list[i], "0");
                case "one" : s = s.replaceAll(list[i], "1");
                case "two" : s = s.replaceAll(list[i], "2");
                case "three" : s = s.replaceAll(list[i], "3");
                case "four" : s = s.replaceAll(list[i], "4");
                case "five" : s = s.replaceAll(list[i], "5");
                case "six" : s = s.replaceAll(list[i], "6");
                case "seven" : s = s.replaceAll(list[i], "7");
                case "eight" : s = s.replaceAll(list[i], "8");
                case "nine" : s = s.replaceAll(list[i], "9");
            }
        }

        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
    }
}
