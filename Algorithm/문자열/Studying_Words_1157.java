package 문자열;

import java.util.Scanner;

public class Studying_Words_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		words = words.toUpperCase();
		int judge[] = new int[26];
		for(int i = 0; i < words.length(); i++) {
			judge[(int)words.charAt(i) - 65]++;
		}
		int max = 0, index = 0;
		for(int i = 0; i < judge.length; i++) {
			if(max < judge[i] && judge[i] != 0) {
				max = judge[i];
				index = i;
			}
		}
		char answer = (char)(index+65);
		for(int i = 0; i < judge.length; i++) {
			if(i == index) continue;
			if(judge[i] == judge[index] && judge[i] != 0) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}
