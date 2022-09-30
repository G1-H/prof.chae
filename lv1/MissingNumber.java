public class MissingNumber {
    public int solution(int[] numbers) {
        int sum = 45;

        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        MissingNumber m = new MissingNumber();
        int[] num = { 1, 2, 3, 4, 6, 7, 8, 0 };
        System.out.println(m.solution(num));
        int[] num2 = { 5, 8, 4, 0, 6, 7, 9 };
        System.out.println(m.solution(num2));

    }
}
