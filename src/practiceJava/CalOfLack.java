package practiceJava;

public class CalOfLack {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long total =0;
        int cnt = 1;
        while(cnt <= count) {
        	total += price * cnt;
        	cnt++;
        }
        
        answer = total>money ? total-money : 0;
        return answer;
    }
	
	public static void main(String[] args) {
		CalOfLack lack = new CalOfLack();
		System.out.println(lack.solution(3,20,4));
	}
}
