
public class test {
    public void test1(int score) {
        if (score >= 80)
            System.out.println("합격");
        else if (score < 40)
            System.out.println("과락");
        else
            System.out.println("대기");
    }

    public void test2() {
        int price = 110000;
        int ea = 3;

        int amount = price * ea;
        int tax = (int) (amount * 0.1);
        int totAmount = amount + tax;
        String str = "";

        if (totAmount >= 1000) {
            str = "비행기";
        } else if (totAmount >= 500) {
            str = "자동차";
        } else if (totAmount >= 300) {
            str = "자전거";
        } else {
            str = "화장지";
        }

        System.out.println("수량 " + ea);
        System.out.println("단가 " + price);
        System.out.println("세금 " + tax);
        System.out.println("금액 " + amount);
        System.out.println("총액 " + totAmount);
        System.out.println("사은품 " + str);
    }

    public static void main(String[] args) {
        test test = new test();

        test.test1(80);
        test.test1(90);
        test.test1(30);
        test.test1(40);
        test.test1(79);

        test.test2();
    }
}
