package lv2;

import java.util.stream.Stream;

public class MaxMin {
    public String solution(String s) {
        int[] sArray = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = sArray[0];
        int min = sArray[0];

        for (int sa : sArray) {
            max = Math.max(max, sa);
            min = Math.min(min, sa);
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        MaxMin m = new MaxMin();
        System.out.println(m.solution("1 2 3 4"));
        System.out.println(m.solution("-1 -2 -3 -4"));
        System.out.println(m.solution("-1 -1"));
    }
}
