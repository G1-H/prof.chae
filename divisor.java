public class divisor {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n <= 1) {
                answer = i;
            } else if (n % i == 0) {
                answer += i;
                if (n / i != i) {
                    answer += ((int) (n / i));
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        divisor d = new divisor();

        d.solution(0);
        d.solution(1);
        d.solution(2);
        d.solution(3);
        d.solution(4);
        d.solution(12);
    }
}
