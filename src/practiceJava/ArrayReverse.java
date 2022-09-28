package practiceJava;
import java.util.Arrays;
public class ArrayReverse {
	 public int[] solution(long n) {
	        int x = 0;
	        long number = n;
	        while(n!=0) {
	        	n=(int)(n/10);
	        	x++;
	        }
	        int[] answer = new int[x] ;
	        
	        for(int i=0; i<x; i++) {
        		answer[i] = (int)(number%10);
        		number/=10;
	        	
	        }
	        
	        return answer;
	    }
		
		
		
	
	public static void main(String[]s) {
		ArrayReverse ar = new ArrayReverse();
		System.out.println(Arrays.toString(ar.solution(-123)));
		System.out.println(Arrays.toString(ar.solution(12311)));
	}
}
