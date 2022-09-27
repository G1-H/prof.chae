package practiceJava;

public class Divisor {
	public void DivisorNum(int num) {
		int divisor = 0;
		
		for (int i=1; i<=num; i++) {
			if(num%i!=0) continue;
			divisor += i;
		}
		
		System.out.println(divisor);
	}
	
	public static void main(String[]abc) {
		Divisor dv = new Divisor();
		dv.DivisorNum(3);
		dv.DivisorNum(5);
		dv.DivisorNum(12);
		dv.DivisorNum(8);
	}
}
