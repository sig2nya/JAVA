package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortInside_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split("");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(Integer.parseInt(nums[i]));
        }
        Collections.sort(list);
        int i = list.size() - 1;
        while(i >= 0){
            System.out.print(list.get(i--));
        }
    }
}
