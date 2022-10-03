package practiceJava;

public class SumOfNotExist {

	  public int solution(int[] numbers) {
	        int answer = 0;
	        for(int i = 0  ; i<numbers.length; i++) {
	        	for(int j = 0; j <10 ; j++) {
	        		if( numbers[i] == j){
	        			answer +=j;
	        		}
	        	}
	        }
	        answer = 45-answer;
	        return answer;
	    }
	  
	  public static void main(String[] arg) {
		  SumOfNotExist sne = new SumOfNotExist();
		  int[] numbers = {1,2,3,5,7,9};
		  System.out.println(sne.solution(numbers));
	  }
}
