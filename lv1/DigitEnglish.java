public class DigitEnglish {
    public int solution(String s) {
        String num[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < 10; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }

        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        DigitEnglish d = new DigitEnglish();
        System.out.println(d.solution("one4seveneight"));
        System.out.println(d.solution("23four5six7"));
        System.out.println(d.solution("2three45sixseven"));
        System.out.println(d.solution("123"));
    }
}
