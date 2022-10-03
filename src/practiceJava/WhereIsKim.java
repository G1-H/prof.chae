package practiceJava;
import java.util.*;

public class WhereIsKim {
	 public String solution(String[] seoul) {
	        String answer = "";
	        ArrayList<String>  find = new ArrayList<String>(Arrays.asList(seoul));
	        int index = find.indexOf("Kim");
	        answer = "김서방은 " + index + "에 있다.";
	        return answer;
	    }
	 public static void main(String[] arg){
		 WhereIsKim wik = new WhereIsKim();
		 String[] seoul = {"Jane", "Hwang", "Kim", "Han"};
		 System.out.println(wik.solution(seoul));
		 
		 
	 }
}
