package 프로그래머스.lv1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static int solution(int board[][], int moves[]){
        int cnt = 0; Stack stack = new Stack();
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i] - 1] == 0 && board[board.length - 1][moves[i] - 1] != 0) continue;
                stack.push(board[j][moves[i] - 1]);
                board[j][moves[i] - 1] = 0;
                if((int)stack.peek() == 0) stack.pop();
                if(stack.size() >= 2 && stack.peek() == stack.get(stack.size() - 2)){
                    stack.pop(); stack.pop();
                    cnt += 2;
                }
                break;
            }
        }
        return cnt;
    }

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
        System.out.println(solution(board, moves));
    }
}
