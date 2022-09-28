package Mission;

public class HarshadNumber {
	public static void main(String[] z) {
		HarshadNumber h = new HarshadNumber();
		System.out.println(h.Harshad(11));
	}
	
	public static String Harshad(int x) {
		String[] arry = String.valueOf(x).split("");
		String r;
		int sum = 0;
		for(String i:arry) {
			sum += Integer.parseInt(i);
		}
		if(x%sum==0) r = "true";
		else r = "False";
		
		return r;
	}
}
