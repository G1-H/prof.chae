import java.util.Arrays;

class Reverse {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Reverse d = new Reverse();
        System.out.println(Arrays.toString(d.solution(100)));
    }
}