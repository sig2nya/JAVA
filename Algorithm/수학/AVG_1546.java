package 수학;

import java.util.Arrays;
import java.util.Scanner;

public class AVG_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		float avg[] = new float[size];
		for(int i = 0; i < size; i++) avg[i] = sc.nextInt();
		Arrays.sort(avg);
				
		for(int i = 0; i < size; i++) avg[i] = avg[i]/avg[size-1]*100;
		
		float result = 0;
		for(int i = 0; i < size; i++) result += avg[i];
		System.out.println(result/size);
	}
}
