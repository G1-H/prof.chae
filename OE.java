package Mission;

public class OE {
	public void OeTest() {
		int num = 6;
		String r = "";
		if(num%2==0) r = "Even";
		else r = "Odd";
		System.out.print(r);
	}
	public static void main(String[] z) {
		OE oe = new OE();
		oe.OeTest();
	}
}
