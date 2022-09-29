package practiceJava;
public class StrToInt {
	public int solution(String s) {
		int answer = 0;
		answer = Integer.valueOf(s);
		return answer;
	}
	
	public static void main(String[] arg) {
		StrToInt sti = new StrToInt();
		System.out.println(sti.solution("-123"));
	}
		
}
