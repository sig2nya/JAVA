package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumOfWords_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		StringTokenizer st = new StringTokenizer(words, " ");
		System.out.println(st.countTokens());
	}
}
