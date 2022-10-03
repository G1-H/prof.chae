package practiceJava;
public class HideNumber {
    public String solution(String phone_number) {
        String answer = "";
        int k = phone_number.length();
        for(int i = 0; i <k-4; i++) {
        	answer += "*";
        }
        answer += phone_number.substring(k-4, k);
        
        return answer;
    }
    
    public static void main(String[] arg) {
    	HideNumber hn = new HideNumber();
    	String phone_number = "01027916217";
    	System.out.println(hn.solution(phone_number));
    }

}
