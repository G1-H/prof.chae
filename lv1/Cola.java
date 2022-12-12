class Cola {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = 0;

        while (n >= a) {
            cnt = answer;
            answer += n / a * b;
            n = answer - cnt + (n % a);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 1, 20));
        System.out.println(solution(2, 1, 20));
    }
}