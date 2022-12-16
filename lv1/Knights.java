public class Knights {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int before = 0;

        for (int n = 1; n <= number; n++) {
            before = answer;

            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    answer++;
                    if (n / i != i) {
                        answer++;
                    }
                }

                if (answer - before > limit) {
                    answer = before;
                    answer += power;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Knights k = new Knights();
        System.out.println(k.solution(5, 3, 2));
        System.out.println(k.solution(10, 3, 2));
    }
}
