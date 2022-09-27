public class EvenOdd {
    public String Check(int a) {
        return a % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOdd num = new EvenOdd();
        System.out.println(num.Check(2));
    }
}
