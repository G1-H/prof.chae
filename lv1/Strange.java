import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

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

    public String solu(String s) {
        StringBuilder sb = new StringBuilder();
        String[] temp1 = s.split("");
        int index = 0;

        System.out.println("temp1:" + Arrays.toString(temp1));
        for (int i = 0; i < temp1.length; i++) {
            System.out.println(temp1[i] + ".");
            if (temp1[i].equals(" ")) {
                sb.append(" ");
                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(temp1[i].toUpperCase());
                    index++;
                } else {
                    sb.append(temp1[i].toLowerCase());
                    index++;
                }
            }
        }
        return sb.toString().substring(0, sb.length());

    }

    public static void main(String[] args) {
        Strange str = new Strange();

        String s = "try hello world";
        System.out.println(str.solution(s) + ".");
        System.out.println(str.solu(s) + ".");

        s = "try allo hello world";
        System.out.println(str.solution(s) + ".");
        System.out.println(str.solu(s) + ".");

        s = "tRy hello wOrld";
        System.out.println(str.solution(s) + ".");
        System.out.println(str.solu(s) + ".");

        s = "tRy            hello wOrld";
        System.out.println(str.solution(s) + ".");
        System.out.println(str.solu(s) + ".");

        s = " tRy            hello wOrld   ";
        System.out.println(str.solution(s) + ".");
        System.out.println(str.solu(s) + ".");
    }
}