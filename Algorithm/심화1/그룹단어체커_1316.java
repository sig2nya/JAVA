package 심화1;

import java.util.Scanner;

public class 그룹단어체커_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), cnt = 0;
        for(int i = 0; i < N; i++){
            String word = sc.next();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;

            for(int j = 0; j < word.length(); j++){
                char c = word.charAt(j);

                if(!visited[c - 'a']){
                    visited[c - 'a'] = true;
                } else {
                    if(word.charAt(j - 1) != c){
                        isGroupWord = false;
                        break;
                    }
                }
            }
            if(isGroupWord){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
