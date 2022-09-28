package Mission;

public class Py {
	public static void main(String[] z) {
		Py p = new Py();
		String s = "Pyy";
		String s2 = s.toLowerCase();
		System.out.println(s2);
		
		if((Count(s2,'p')==-1 && Count(s2,'y')==-1)) {
			System.out.println("True");
		}else if((Count(s2,'p')==Count(s2,'y'))) {
			System.out.println("True");
		}else if(!(Count(s2,'p')==Count(s2,'y'))) {
			System.out.println("False");
		}
	}
	
	public static int Count(String s2, char ch) {
		
		int c = 0;
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)==ch) c++;
		}
		return c;
	}
	
}
