import java.util.Arrays;

class Strange {
    public String solution(String st) {
        int cnt = 0;
        String answer = "";
        st = st.toLowerCase();

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                cnt = 0;
                answer += " ";
            } else {
                answer += ((cnt % 2 == 1) ? st.charAt(i) : (char) (st.charAt(i) - 32));
                cnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Strange str = new Strange();

        String s = "try hello world";
        System.out.println(str.solution(s));

        s = "tRy hello wOrld";
        System.out.println(str.solution(s));

        s = "tRy            hello wOrld";
        System.out.println(str.solution(s));

        s = " tRy            hello wOrld   ";
        System.out.println(str.solution(s));
    }
}