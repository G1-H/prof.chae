package practiceJava;
import java.util.Arrays;

public class SortDesc {
	public long solution(long n) {
		long answer = 0;
		
		String str = String.valueOf(n);
		String[] strArray = str.split("");
		
		String[] strArray2 = new String[strArray.length];
		Arrays.sort(strArray);
		for(int i = 0; i <strArray.length; i++) {
			strArray2[i] = strArray[strArray.length-i-1];
		}
		String str2 ="";
		for (String i : strArray2) {
	        str2 += i;
	    }
		
		answer = Long.valueOf(str2);
		return answer ;
		
	}
	
	public static void main(String[] arg) {
		SortDesc sd = new SortDesc();
		
		System.out.println(sd.solution(118372));
	}
}
