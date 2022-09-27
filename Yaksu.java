package Mission;

public class Yaksu {
	public void Yaksu() {
		int n = 6;
		int sum = 0;
		for(int a=1; a<=n; a++) {
			if((n%a)==0) sum = sum + a;
		}
		System.out.print(sum);
	}
	public static void main(String[] z) {
		Yaksu y = new Yaksu();
		y.Yaksu();
	}
}
