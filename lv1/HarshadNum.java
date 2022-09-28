public class HarshadNum {
    public boolean solution(int x) {
        int sum = Integer.toString(x).chars().map(c -> c - '0').sum();

        return x % sum == 0;
    }

    public static void main(String[] args) {
        HarshadNum h = new HarshadNum();

        System.out.println(h.solution(10));
        System.out.println(h.solution(12));
        System.out.println(h.solution(11));
        System.out.println(h.solution(13));
    }
}
