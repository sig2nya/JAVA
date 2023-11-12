package NICE정보통신;

import java.util.HashMap;

public class NO2 {
    public static void main(String[] args) {
        String line1 = "abbbcbbb";
        String line2 = "bbb";

        line2 = transformString(line2);
        line2 = transformString(line2);
        System.out.println(line2);
    }
    public static String transformString(String original) {
        StringBuilder builder = new StringBuilder();
        StringBuilder transformed = new StringBuilder();
        int length = original.length();

        for (int i = 0; i < length; i++) {
            transformed.append(original.charAt(i));
            if(original.charAt(i) == '_') continue;
            if (i < length - 1) {
                transformed.append('_');
            }
        }

        return transformed.toString();
    }

    public static int countSubstrings(String line1, String line2) {
        // 부분 문자열의 일치 유무 확인.
        // target인 line1에서 index를 0 ~ line1.length()까지 비교 수행

        int len1 = line1.length();
        int len2 = line2.length();
        int cnt = 0;

        for (int i = 0; i <= len1 - len2; i++) {
            boolean match = true;
            for (int j = 0; j < len2; j++) {
                if (line1.charAt(i + j) != line2.charAt(j)) { // 비교 알고리즘의 핵심 로직이다. 잘 기억해두자.
                    match = false;
                    break;
                }
            }

            if (match) {
                cnt++;
            }
        }

        return cnt;
    }
}
