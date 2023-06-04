package 프로그래머스.lv1;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        solution(id_list, report, 2);
    }
    public static int[] solution(String[] id_list, String[] report, int k){
        int ret[] = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();

        for(int i = 0; i < id_list.length; i++){
            index.put(id_list[i], i);
        }

        for(String rep : report){
            String[] ids = rep.split(" ");
            if(!list.containsKey(ids[1])) list.put(ids[1], new ArrayList<>());

            List<Integer> tmp = list.get(ids[1]);
            if(!tmp.contains(index.get(ids[0]))) tmp.add(index.get(ids[0]));
        }
        return ret;
    }

}
