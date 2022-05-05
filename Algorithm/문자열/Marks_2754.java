package 문자열;

import java.util.Scanner;

public class Marks_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mark = sc.next();
        if(mark.equals("A+")){
            System.out.println(4.3);
        } else if(mark.equals("A0")){
            System.out.println(4.0);
        } else if(mark.equals("A-")){
            System.out.println(3.7);
        } else if(mark.equals("B+")){
            System.out.println(3.3);
        }else if(mark.equals("B0")){
            System.out.println(3.0);
        }else if(mark.equals("B-")){
            System.out.println(2.7);
        }else if(mark.equals("C+")){
            System.out.println(2.3);
        }else if(mark.equals("C0")){
            System.out.println(2.0);
        }else if(mark.equals("C-")){
            System.out.println(1.7);
        }else if(mark.equals("D+")){
            System.out.println(1.3);
        }else if(mark.equals("D0")){
            System.out.println(1.0);
        }else if(mark.equals("D-")){
            System.out.println(0.7);
        }else if(mark.equals("F")){
            System.out.println(0.0);
        }
    }
}
