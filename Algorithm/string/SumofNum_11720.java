package string;

import java.util.Scanner;

public class SumofNum_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String num = sc.next();
		N = 0;
		for(int i = 0; i < num.length(); i++) {
			N += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(N);
	}

}
