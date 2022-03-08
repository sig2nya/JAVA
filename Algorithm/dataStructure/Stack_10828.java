package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stack_10828 {
    private final List<Integer> list = new ArrayList<>();
    private int top = 0;

    public void push(int x){
        if(top < 0) return;
        list.add(x);
        top++;
    }

    public void pop(){
        if(top <= 0) {
            System.out.println(-1);
            return;
        }
        else{
            if(top <= 0) System.out.println(-1);
            else System.out.println(list.get(top - 1));
            list.remove(top - 1);
            top--;
        }
    }

    public void size(){
        System.out.println(list.size());
    }

    public void empty(){
        if(list.isEmpty()){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void top(){
        if(list.isEmpty()){
            System.out.println(-1);
        } else {
            System.out.println(list.get(top - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        Stack_10828 stack = new Stack_10828();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String [] str = new String[2];
            str = br.readLine().split(" ");
            if(str.length == 2){
                stack.push(Integer.parseInt(str[1]));
            } else {
                if(str[0].equals("pop")) stack.pop();
                else if(str[0].equals("empty")) stack.empty();
                else if(str[0].equals("top")) stack.top();
                else if(str[0].equals("size")) stack.size();
            }
        }
    }
}
