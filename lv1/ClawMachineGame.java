import java.util.*;

public class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    result.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        if (result.size() > 1) {
            for (int k = 0; k < result.size() - 1; k++) {
                if (result.get(k) == result.get(k + 1)) {
                    result.remove(k);
                    result.remove(k);
                    answer += 2;
                    k = (k == 0) ? (k - 1) : (k - 2);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ClawMachineGame c = new ClawMachineGame();
        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
        int[] moves = { 1, 2, 3, 4 };
        System.out.println(c.solution(board, moves));
    }
}
