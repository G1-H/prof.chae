public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            if (str.contains("woowoo") || str.contains("ayaaya") || str.contains("mama") || str.contains("yeye"))
                continue;
            str = str.replace("woo", " ");
            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");
            if (str.equals("")) {
                answer++;
            }

        }
        return answer;

    }

    public static void main(String[] args) {
        Babbling b = new Babbling();

        String[] babbling = { "aya", "yee", "u", "maa", "woayao", "wooyemawooye", "mayaa", "ymaeaya" };
        System.out.println(b.solution(babbling));

        String[] babbling2 = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
        System.out.println(b.solution(babbling2));

        String[] babbling3 = { "ayaaya", "woowoo", "yeye", "mama" };
        System.out.println(b.solution(babbling3));
    }
}
