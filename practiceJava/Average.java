package practiceJava;

public class Average {
	public void AverageArray(int[] arr) {
		int hap = 0;
		for(int i =0; i<arr.length ; i++) {
			hap += arr[i];
		}
		System.out.println((double)hap/arr.length);
	}
	
	public void AverageArray2(int[] arr) {
		int hap = 0;
		for(int ar : arr) {
			hap += ar;
		}
		System.out.println((double)hap/arr.length);
	}
	
	public static void main(String[]abc) {
		Average a = new Average();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};
		a.AverageArray(arr1);
		a.AverageArray(arr2);
		
		a.AverageArray2(arr1);
		a.AverageArray2(arr2);
		
		
	}
}
