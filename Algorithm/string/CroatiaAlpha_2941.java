package string;

import java.util.Scanner;

public class CroatiaAlpha_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(int i = 0; i < str.length; i++){
			if(st.contains(str[i])) st = st.replace(str[i], "!");
		}
		System.out.println(st.length());
	}
}
