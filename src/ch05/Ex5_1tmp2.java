package ch05;

public class Ex5_1tmp2 {
	public static void main(String[] args) {
		// index 범위는 : 0~ 9
		int[] arr = new  int[15]; 
		System.out.println("arr.length="+arr.length);
				
		for(int i = 0; i<arr.length; i++) { // index 범위를 벗어 나지 않도록 조심
			System.out.println("arr["+i+"]="+arr[i]);
			
			
		}
	}
}
