package ch05;

import java.util.Arrays;

public class Ex5_2tmp {
	public static void main(String args[]) {
		int[] arr = {3,4,1,0,2}; // 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; // 2차원 배열
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"ccc","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D,str2D2));
		
		int[] arr2 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr2)); 
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3)); 
	}
}
