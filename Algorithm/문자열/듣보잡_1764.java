package 문자열;

import java.util.*;

public class 듣보잡_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) set.add(sc.next());

        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < M; i++){
            String str = sc.next();
            if(set.contains(str)){
                cnt++;
                list.add(str);
            }
        }

        Iterator it = list.iterator();
        System.out.println(cnt);
        while(it.hasNext()) System.out.println(it.next());
    }
}
