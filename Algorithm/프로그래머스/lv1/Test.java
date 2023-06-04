package 프로그래머스.lv1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> index = new HashMap<>();
        HashMap<String, List<Integer>> list = new HashMap<>();

        index.put("proto", 0);
        list.put("muzi", new ArrayList<>());

        List<Integer> tmp = list.get("muzi");
        System.out.println(tmp.contains(index.get("proto")));
    }
}
