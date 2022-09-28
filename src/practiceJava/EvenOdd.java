package practiceJava;

public class EvenOdd {	
	public void EvenOddTest(int num) {
		if(num%2==0) System.out.println("Even");
		else		 System.out.println("Odd");
	}
	public static void main(String[] abc) {
		EvenOdd eo = new EvenOdd();
		eo.EvenOddTest(3);;
		eo.EvenOddTest(100);
	}
}
