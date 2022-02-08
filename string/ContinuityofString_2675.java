package string;

import java.util.Scanner;

public class ContinuityofString_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String answer[] = new String[N];
		for(int i = 0; i < N; i++) answer[i] = "";
		
		for(int i = 0; i < N; i++) {
			int R = sc.nextInt(); String S = sc.next(); String tmp[] = new String[S.length()];
			tmp = S.split("");
			for(int j = 0; j < tmp.length; j++) {
				answer[i] += tmp[j].repeat(R);
			}
		}
		
		for(int i = 0; i < N; i++) System.out.println(answer[i]);
	}

}
