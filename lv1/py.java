public class py {
    boolean solution(String s) {
        char[] charArray = s.toUpperCase().toCharArray();
        int cntp = 0;
        int cnty = 0;
        for (char ch : charArray) {
            if (ch == 'P')
                cntp++;
            else if (ch == 'Y')
                cnty++;
        }

        return cntp == cnty;
    }

    public static void main(String[] args) {
        py p = new py();
        System.out.println(p.solution("pPoooyY"));
        System.out.println(p.solution("pPoooY"));
    }
}
