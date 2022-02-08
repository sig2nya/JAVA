package math;

import java.util.Scanner;

public class Remainer_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result[] = new int[42];
		for(int i = 0; i < 10; i++) {
			result[sc.nextInt() % 42]++;
		}
		int answer = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] != 0) answer++;
		}
		System.out.println(answer);
	}

}
