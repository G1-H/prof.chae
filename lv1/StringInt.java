public class StringInt {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        StringInt s = new StringInt();
        System.out.println(s.solution("1234"));
        System.out.println(s.solution("-1234"));
    }
}
