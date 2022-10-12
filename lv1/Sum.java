public class Sum {
    public long solution(int a, int b) {
        long sum = 0L;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.solution(3, 5));
        System.out.println(s.solution(3, 3));
        System.out.println(s.solution(5, 3));
    }
}
