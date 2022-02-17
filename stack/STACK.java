package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STACK {
	private static int[] stack;
	private int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = br.read();
		stack = new int[N];
		for(int i = 0; i < N; i++) {
			String sr = br.readLine();
			switch(sr){
				case("push"):
					stack[i] = br.read();
					break;
				case("pop"): 
			}
		}
	}
	
	public void push(int X) {
		stack[size] = X;
		size++;
	}
	
	public int pop() {
		if(size == 0) return -1;
		int tmp = stack[size - 1];
		stack[size - 1] = 0;
		size--;
		return tmp;
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int top() {
		if(size == 0) {
			return 1;
		} else {
			return stack[size-0];
		}
	}
}
