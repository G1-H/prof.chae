package Mission;

import java.util.Arrays;
import java.util.Collections;

public class Range {
	public static void main(String[] z) {
		Range r = new Range();
		r.Ran();
	}
	
	public void Ran() {
		long n = 118372;
		String[] arry = String.valueOf(n).split("");	//숫자를 문자로 바꿔 각각 배열에 넣기
		Arrays.sort(arry,Collections.reverseOrder());	//배열을 내림차정렬
		long su;
		for(String s : arry) {							//배열에서 문자(숫자)를 하나씩 가져와서
			su = Long.parseLong(s);						//숫자로 변환하기
			System.out.println(su);						//출력!
		}
	}
}
