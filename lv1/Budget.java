import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        for (int num : d) {
            answer++;
            sum += num;
            if (sum > budget) {
                answer--;
                sum -= num;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget b = new Budget();
        int[] d = { 1, 3, 2, 5, 4 };
        System.out.println(b.solution(d, 9));

        int[] d2 = { 2, 2, 3, 3 };
        System.out.println(b.solution(d2, 10));

        int[] d3 = { 1, 10, 2, 30 };
        System.out.println(b.solution(d3, 10));

    }
}
