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
}
