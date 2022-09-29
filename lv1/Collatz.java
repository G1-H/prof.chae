public class Collatz {
    public int solution(int num) {
        int answer = 0;
        while (num != 1) {
            num = (num % 2 == 0) ? num / 2 : ((num % 2 == 1) ? (num * 3) + 1 : num);
            answer++;
            if (answer >= 500) {
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Collatz c = new Collatz();

        System.out.println(c.solution(6));
        System.out.println(c.solution(16));
        System.out.println(c.solution(626331));
    }
}
