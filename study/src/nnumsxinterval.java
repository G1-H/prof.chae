import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        int a = x;
        int i;
        for(i=0; i<n; i++) {
            int N = answer.length;
            answer = Arrays.copyOf(answer, N + 1);
            answer[N] = a;
            a += x;
            if (a > 10000000 || a < -10000000) {
                break;
            }
        }
        return answer;
    }
}