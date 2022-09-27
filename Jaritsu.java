package Mission;

public class Jaritsu {
	public void Jari() {
		int n = 123;
		int sum = 0;
		String[] arr = String.valueOf(n).split("");
		for(String s:arr) {
			sum += Integer.parseInt(s);
		}
		System.out.print(sum);
	}
	
	public static void main(String[] z) {
		Jaritsu ja = new Jaritsu();
		ja.Jari();
	}
}
