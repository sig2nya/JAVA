package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Queue_10845 {
    private final List<Integer> list = new ArrayList<>();

    public void push(int x){
        list.add(x);
    }

    public void pop(){
        if(list.size() == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(list.get(0));
        list.remove(0);
    }

    public void size(){
        System.out.println(list.size());
    }

    public void empty(){
        if(list.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }

    public void front(){
        if(list.isEmpty()) {
            System.out.println(-1);
            return;
        }
        System.out.println(list.get(0));
    }

    public void back(){
        if(list.isEmpty()) {
            System.out.println(-1);
            return;
        }
        System.out.println(list.get(list.size() - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue_10845 q = new Queue_10845();
        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            if(arr.length == 2){
                q.push(Integer.parseInt(arr[1]));
            }else{
                if(arr[0].equals("pop")) q.pop();
                else if(arr[0].equals("size")) q.size();
                else if(arr[0].equals("empty")) q.empty();
                else if(arr[0].equals("front")) q.front();
                else if(arr[0].equals("back")) q.back();
            }
        }
    }
}
