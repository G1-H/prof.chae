package Mission;

public class Avg {
	public void AvgTest(){
		int[] arr = {1,2,3,4,5,6,7,8};
		
		int sum = 0;
		for(int num:arr) {	//대입받을 변수정의:배열명 즉, arr배열항목을 처음부터 하나씩 num에 대입하여 실행, 배열만 사용 가능
			sum += num;		//arr[0]인 1을 num에 담아 실행됨
		}
		int avg = sum/arr.length;
		System.out.print(avg);
	}
	
	public static void main(String[] z) {
		Avg a = new Avg();
		a.AvgTest();
	}
}
