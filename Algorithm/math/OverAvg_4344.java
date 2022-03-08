package math;

import java.util.Scanner;

public class OverAvg_4344 {
	public static float avg(int[] arr) {
		float avg = 0;
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		return avg / arr.length;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		float result[] = new float[C];
		
		for(int i = 0; i < C; i++) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int j = 0; j < size; j++) arr[j] = sc.nextInt();
			
			int cnt = 0;
			
			for(int j = 0; j < size; j++) if(arr[j] > avg(arr)) {
				cnt++;
			}
			result[i] = (float)cnt / (float)size;
		}
		
		for(int i = 0; i < C; i++) {
			System.out.printf("%.3f", result[i] * 100);
			System.out.println("%");
		}
	}

}
// chagnge