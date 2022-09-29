package practiceJava;

import java.util.Arrays;

public class NthInteger {
	public long[] solution (long x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0 ; i<n ;i++ ) {
			answer[i] = x+i*x;
		}
		
		return answer;
	}
	
	public static void main(String[] arg) {
		NthInteger ni = new NthInteger();
		System.out.println(Arrays.toString(ni.solution(1, 10)));
		
		
	}
}
