package practiceJava;

public class Square {
	public void SquareNumber(long num) {
		long answer =-1;
		for(int i=1; i<num/2 ; i++) {
		if(num/i !=i) continue;
		answer= (i+1)*(i+1);
		}
		
		System.out.println(answer);
	}
	
	public void SquareNumber2(long num) {
		long answer =-1;
		int i = 0;
		while(answer == -1 & i<num/2) {
		i++;
		if(num/i !=i) continue;
		answer= (i+1)*(i+1);
		}
		
		//루프 반복 횟수 줄일 수 있는 최적의 방법은 뭘까 ㅠㅠ 
		
		System.out.println(answer);
	}
	public static void main(String[]abc) {
		Square s = new Square();
		s.SquareNumber(121);
		s.SquareNumber(9);
		s.SquareNumber(8);
		s.SquareNumber2(121);
		s.SquareNumber2(9);
		s.SquareNumber2(8);
		s.SquareNumber2(1999);
	}
}
