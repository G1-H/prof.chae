import java.util.*;

public class Seoul {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }

    public static void main(String[] args) {
        Seoul s = new Seoul();
        String[] seoul = { "Jane", "Kim" };
        System.out.println(s.solution(seoul));
    }
}
