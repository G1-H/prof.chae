public class DivisorCntSum {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (Math.sqrt(i) % 1 == 0)
                answer -= i;
            else
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        DivisorCntSum dcs = new DivisorCntSum();
        System.out.println(dcs.solution(13, 17));
        System.out.println(dcs.solution(24, 27));

    }
}