package math;

import java.util.Scanner;

public class NumOfNum_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		int result[] = new int[10];
		while(num > 0) {
			result[num % 10]++;
			num /= 10;
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
