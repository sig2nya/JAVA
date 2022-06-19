package 문자열;

import java.util.Scanner;

public class 크로아티아알파벳_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for(int i = 0; i < cro.length; i++){
			if(str.contains(cro[i])) str = str.replace(cro[i], "!");
		}
		System.out.println(str.length());
	}
}
