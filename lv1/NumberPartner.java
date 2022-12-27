import java.util.Arrays;
import java.util.Collections;

class NumberPartner {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int a = Collections.frequency(Arrays.asList(X.split("")), Integer.toString(i));
            int b = Collections.frequency(Arrays.asList(Y.split("")), Integer.toString(i));
            System.out.println(a + " " + b);
            for (int j = 0; j < Math.min(a, b); j++) {
                sb.append(i);
            }
        }
        String r = sb.toString();
        if (r.equals(""))
            return "-1";
        else if (r.matches("^0+"))
            return "0";
        return r;

    }

    public static void main(String[] args) {
        NumberPartner np = new NumberPartner();
        System.out.println(np.solution("3403", "13203"));
        System.out.println(np.solution("5525", "1255"));
        System.out.println(np.solution("100", "2345"));
        System.out.println(np.solution("100", "203045"));
        System.out.println(np.solution("100", "203015"));
    }
}