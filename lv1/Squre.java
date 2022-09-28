public class Squre {
    public long solution(long n) {
        if (Math.sqrt(n) % 1.0 != 0) {
            return -1;
        }
        return (long) Math.pow(Math.sqrt(n) + 1, 2);
    }

    public static void main(String[] args) {
        Squre s = new Squre();
        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}
