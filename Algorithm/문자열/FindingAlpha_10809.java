package 문자열;

import java.util.Scanner;

public class FindingAlpha_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int answer[] = new int[26];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = -1;
		}
		for(int i = 0; i < S.length(); i++) {
			if(answer[S.charAt(i) - 97] != -1) continue;
			answer[(int)S.charAt(i) - 97] = i;
		}
		
		for(int i = 0; i < answer.length; i++) System.out.print(answer[i] + " ");
	}

}
