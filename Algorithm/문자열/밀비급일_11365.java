package 문자열;

import java.util.Scanner;

public class 밀비급일_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.equals("END")) break;
            System.out.println(new StringBuffer(line).reverse());
        }
    }
}
