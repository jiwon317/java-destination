package ch05;

import java.util.Arrays;

public class Ex5_2tmp {
	public static void main(String args[]) {
		int[] arr = {0,1,2,3,4}; // 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; // 2차원 배열
		
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.deepToString(arr2D));
	}
}
