import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] a = str.toCharArray();
        Arrays.sort(a);
        String sb = new StringBuilder(new String(a)).reverse().toString();
        return Long.parseLong(sb);
    }
}