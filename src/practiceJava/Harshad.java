package practiceJava;

public class Harshad {
	    public boolean solution(int x) {
	        boolean answer = true;
	        int temp = x;
	        int hap = 0;
	        
	        while(temp>0){
	            hap += temp%10;
	            temp /=10;
	        }
	        
	        if(x%hap != 0) answer = false;
	        
	        return answer;
	        
	    }
	public static void main(String[] s) {
		Harshad h = new Harshad();
		System.out.println(h.solution(11));
		System.out.println(h.solution(12));
		
	}
}

