package control;

public class IfTest {
	public void test1() {
		int score = 90;
		if(score>=80) System.out.println("합격");
		else if(score<40) System.out.println("과락");
		else System.out.println("대기");
	}
	
	public void test2() {
		int price = 200;
		int ea = 4;
		int amount = (price*ea);
		int tax = (amount*1/10);
		int totAmount = (amount+tax);
		String event = "";
		if(totAmount>=1000) 	event="비행기";
		else if(totAmount>=500) event="자동차";
		else if(totAmount>=300) event="자전거";
		else event="화장지";
		
		System.out.println("단가 : " + price + "원");
		System.out.println("수량 : " + ea + "개");
		System.out.println("금액 : " + amount + "원");
		System.out.println("세금 : " + tax + "원");
		System.out.println("총액 : " + totAmount + "원");
		System.out.println("사은품 : " + event);
	}
	
	public static void main(String[] args) {
		IfTest it = new IfTest();
		it.test1();
		it.test2();
	}
}
