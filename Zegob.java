package Mission;

public class Zegob {
	public void Zegob() {
		int n = -6;
		double x = Math.sqrt(n);	//Math.sqrt() : 제곱근
		if(x==(int)x) {	//제곱근이 정수인지 확인!
			System.out.println((long)Math.pow(x+1,2));	//Math.pow() : 거듭제곱
		} else {
			System.out.println(-1);
		}
	}
	
	public static void main(String[] z) {
		Zegob zg = new Zegob();
		zg.Zegob();
	}
}
