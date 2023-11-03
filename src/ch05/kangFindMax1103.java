package ch05;

public class kangFindMax1103 {
	public static void main(String args[]) {
		int arr[] = new int[10];
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		} 
		int Max = arr[0];
		int Min = arr[0];
		
		for ( int i = 0; i < arr.length; i++) {
			if( Max < arr[i]) {
				Max = arr[i];
			}
			if( Min > arr[i]) {
				Min = arr[i];
			}
		System.out.println(arr[i]);
		}
		System.out.println("Max 값은 : " + Max);
		System.out.println("Min 값은 : " + Min);
		
		
		
		
		
	}
}
