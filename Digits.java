
//n%10을 이용하는 방법
public class Digits {
    public int solution(int n) {
        int[] digits = Integer.toString(n).chars().map(c -> c - '0').toArray();
        int sum = 0;

        for (int d : digits)
            sum += d;

        return sum;
    }

    public static void main(String[] arg) {
        Digits d = new Digits();
        System.out.println(d.solution(234));
        System.out.println(d.solution(0));

    }
}