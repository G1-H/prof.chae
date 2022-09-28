import java.util.*;

public class Descending {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Comparator.reverseOrder());

        return Long.parseLong(String.join("", list));
    }

    public static void main(String[] args) {
        Descending d = new Descending();
        System.out.println(d.solution(118372L));
    }
}
