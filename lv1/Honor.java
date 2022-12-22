import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Honor {
    public int[] solution(int k, int[] score) {
        List result = new ArrayList<Integer>();
        int[] answer = new int[score.length];
        int min = score[0];
        answer[0] = min;
        result.add(score[0]);

        for (int i = 1; i < score.length; i++) {
            if (result.size() == k) {
                if (min < score[i]) {
                    result.set(result.indexOf(min), score[i]);
                    min = (int) Collections.min(result);
                }
            } else {
                result.add(score[i]);
                min = min > score[i] ? score[i] : min;
            }
            answer[i] = min;
        }

        return answer;
    }

    public static void main(String[] args) {
        Honor h = new Honor();
        int[] s = { 10, 100, 20, 150, 1, 100, 200 };
        System.out.println(Arrays.toString(h.solution(3, s)));

        int[] s2 = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
        System.out.println(Arrays.toString(h.solution(4, s2)));
    }
}
