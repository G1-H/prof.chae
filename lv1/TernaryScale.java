public class TernaryScale {
    public int solution(int n) {
        String sam = Integer.toString(n, 3);
        String reverse = "";

        for (int i = sam.length() - 1; i >= 0; i--)
            reverse = reverse + sam.charAt(i);

        return Integer.parseInt(reverse, 3);
    }

    public static void main(String[] args) {
        TernaryScale t = new TernaryScale();
        System.out.println(t.solution(45));
        System.out.println(t.solution(125));

    }
}
