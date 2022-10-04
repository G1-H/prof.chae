public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }
        if (money <= sum)
            return sum - money;
        else
            return 0;
    }

    public static void main(String[] args) {
        InsufficientAmount i = new InsufficientAmount();

        System.out.println(i.solution(3, 20, 4));
    }
}
