package programmers;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    /*public int solution(int board[][], int moves[]){

    }*/

    public static void main(String[] args) {
        Stack stack = new Stack();
        int board[][] = {
                        {0,0,0,0,0},
                        {0,0,1,0,3},
                        {0,2,5,0,1},
                        {4,2,4,4,2},
                        {3,5,1,3,1}
        };

        int moves[] = {1,5,3,5,1,2,1,4};
        // [j][moves[i] - 1]
        // 4 3 1 1 3 2 * 3
        int cnt = 0;
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i] - 1] == 0 && board[board.length - 1][moves[i] - 1] != 0) continue;
                stack.push(board[j][moves[i] - 1]);
                board[j][moves[i] - 1] = 0;
                if((int)stack.peek() == 0) stack.pop();
                break;
            }
            // System.out.println(stack.peek());
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
