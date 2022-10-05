import java.util.*;

public class StringSorting {
    public String[] solution(String[] strings, int n) {
        String temp = "";
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (Character.compare(strings[j].charAt(n), strings[j + 1].charAt(n)) > 0) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                } else if (Character.compare(strings[j].charAt(n), strings[j + 1].charAt(n)) == 0) {
                    Arrays.sort(strings, j, j + 2);
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        StringSorting s = new StringSorting();
        String[] strings = { "sun", "bed", "car" };
        System.out.println(Arrays.toString(s.solution(strings, 1)));
        String[] strings2 = { "abce", "abcd", "cdx" };
        System.out.println(Arrays.toString(s.solution(strings2, 1)));

    }
}
