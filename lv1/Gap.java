import java.util.*;

public class Gap {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) ((long) x * (1 + i));
        }

        return answer;
    }

    public static void main(String[] args) {
        Gap g = new Gap();
        System.out.println(Arrays.toString(g.solution(2, 5)));
        System.out.println(Arrays.toString(g.solution(4, 3)));
        System.out.println(Arrays.toString(g.solution(-4, 2)));
    }
}
