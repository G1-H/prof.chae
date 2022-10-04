package practiceJava;
import java.util.Arrays;
public class RemoveSameNum {
	public int[] solution(int [] arr) {
		int a=1234;
		int k = 0;
		for(int i = 0; i <arr.length;i++) {
			if(a!=arr[i]) {
				a = arr[i];
				k++;
			}
		}
		int [] answer = new int[k];
		a = 1234;
		k=0;
		for(int i = 0 ; i <arr.length; i++) {
			if(a!=arr[i]) {
				answer[k] = arr[i];
				a=arr[i];
				k++;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[]args) {
		RemoveSameNum rn = new RemoveSameNum();
		int[] a = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(rn.solution(a)));
	}
}
