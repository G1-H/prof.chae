package practiceJava;

public class JariHap {
	public void JariHapNum(int num) {
		String number = String.valueOf(num);
		char[] jari = number.toCharArray();
		
		int hap = 0;
		for (char jar : jari) {
			
			System.out.println(jar);
			hap +=(int)jar;
		}
		
		System.out.println(hap); // 왜 안될까.. ㅠ 도와줘~~~
	}
	public void JariHapNum2(int num) {
		int hap = 0;
		while(num >0) {
			hap += num % 10 ;
			num /= 10 ;
		}
		
		System.out.println(hap);
	}
	
	public static void main(String[]abc) {
		JariHap jh = new JariHap();
		jh.JariHapNum(123);
		jh.JariHapNum(987);
		System.out.println("--------------------------------------");

		jh.JariHapNum2(123);
		jh.JariHapNum2(987);
		
	}
}
