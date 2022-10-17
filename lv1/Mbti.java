public class Mbti {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String result = "";
        String ret = "";

        for (int i = 0; i < survey.length; i++) {
            if (result.contains(String.valueOf(survey[i].charAt(0)))) {
                int index = answer.indexOf(String.valueOf(survey[i].charAt(0)));

                if (answer.charAt(index + 1) - '0' < choices[i] - 4) {
                    result = result.replace(answer.charAt(index), survey[i].charAt(1));
                } else if ((answer.charAt(index + 1) - '0') == (choices[i] - 4)) {
                    result = result.replace(answer.charAt(index),
                            ((answer.charAt(index) > survey[i].charAt(1)) ? survey[i].charAt(1)
                                    : answer.charAt(index)));
                }

            } else if (answer.contains(String.valueOf(survey[i].charAt(1)))) {
                int index = answer.indexOf(String.valueOf(survey[i].charAt(1)));

                if (answer.charAt(index) - '0' < choices[i] - 4) {
                    result = result.replace(answer.charAt(index), survey[i].charAt(0));
                } else if ((answer.charAt(index) - '0') == (4 - choices[i])) {
                    result = result.replace(answer.charAt(index),
                            answer.charAt(index) > survey[i].charAt(0) ? survey[i].charAt(0) : answer.charAt(index));
                }

            } else {

                if (4 > choices[i]) {
                    answer += survey[i].charAt(0);
                    answer += (4 - choices[i]);
                    result += survey[i].charAt(0);
                } else if (4 == choices[i]) {
                    if (survey[i].charAt(0) < survey[i].charAt(1)) {
                        answer += survey[i].charAt(0);
                        answer += "0";
                        result += survey[i].charAt(0);
                    } else {
                        answer += survey[i].charAt(1);
                        answer += "0";
                        result += survey[i].charAt(1);
                    }
                } else {
                    answer += survey[i].charAt(1);
                    answer += (choices[i] - 4);
                    result += survey[i].charAt(1);
                }
            }
        }

        if (result.contains("T") || result.contains("R")) {
            if (result.contains("T"))
                ret += "T";
            else
                ret += "R";
        } else
            ret += "R";
        if (result.contains("C") || result.contains("F")) {
            if (result.contains("F"))
                ret += "F";
            else
                ret += "C";
        } else
            ret += "C";
        if (result.contains("J") || result.contains("M")) {
            if (result.contains("M"))
                ret += "M";
            else
                ret += "J";
        } else
            ret += "J";
        if (result.contains("A") || result.contains("N")) {
            if (result.contains("N"))
                ret += "N";
            else
                ret += "A";
        } else
            ret += "A";

        return ret;
    }

    public static void main(String[] args) {
        Mbti m = new Mbti();
        String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
        int[] choices = { 5, 3, 2, 7, 5 };
        m.solution(survey, choices);

        String[] survey2 = { "TR", "RT", "TR" };
        int[] choices2 = { 7, 1, 3 };
        m.solution(survey2, choices2);

    }
}
