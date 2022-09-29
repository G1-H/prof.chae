public class Remainder {
    public int solution(int n) {
        n = n - 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Remainder r = new Remainder();
        System.out.println(r.solution(10));
        System.out.println(r.solution(12));
    }
}
