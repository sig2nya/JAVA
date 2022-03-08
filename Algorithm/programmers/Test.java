package programmers;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public int[] solution(int []arr) {
        int[] answer;
        List list = new ArrayList();
        boolean[] check = new boolean[10];
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            check[arr[i]] = true;
        }
        list = (List) list.stream().distinct().collect(Collectors.toList());
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = (int)list.get(i);
        }
        return answer;
    }

    /*public String solution(String s) {
        String answer = "";
        String tmp[] = s.split(" ");
        int max = Integer.parseInt(tmp[0]); int min = Integer.parseInt(tmp[0]);
        for(int i = 0; i < tmp.length; i++){
            if(max < Integer.parseInt(tmp[i])) max = Integer.parseInt(tmp[i]);
            if(min > Integer.parseInt(tmp[i])) min = Integer.parseInt(tmp[i]);
        }
        answer += min + " " + max;
        return answer;
    }*/

    static public String solution(String word){
        String answer = "";
        String arr[] = word.split("");
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
        return answer;
    }

    public static void main(String[] args) {
        solution("AAAAE");
    }
}
