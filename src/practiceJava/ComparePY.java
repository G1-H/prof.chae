package practiceJava;

public class ComparePY {
	public boolean solution(String s) {
        boolean answer = true;
        int eaP = 0;
        int eaY = 0;
        eaP = s.length() - (s.toLowerCase()).replace("p", "").length();
        eaY = s.length() - (s.toLowerCase()).replace("y" , "").length();
        
        if (eaP != eaY ) answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
	

	public static void main(String[] ss) {
		ComparePY cpy = new ComparePY();
		System.out.println(cpy.solution("abcpdyPPyY"));
	    
	}
}
