package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의수_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		StringTokenizer st = new StringTokenizer(words, " ");
		System.out.println(st.countTokens());
	}
}
