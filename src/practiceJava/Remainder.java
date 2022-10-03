package practiceJava;

public class Remainder {
	   public int solution(int n) {
	        int answer = 0;
	        int[] Array={};
	        int y = 0;
	        for(int x= 1; x<=n ; x++){
	            if(n%x==1){
	                
	                Array[y] =x;
	                y++;
	            }
	        }
	        
	        return answer;
	    }
}
