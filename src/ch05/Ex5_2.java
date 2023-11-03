package ch05;

public class Ex5_2 {
	public static void main(String args[]) {
		int sum = 0; 			// 총합 저장 위한 변수
		float average = 0f;		// 평균 저장위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 반복문 이용해서 배열 저장 값 모두 더함.
		}
		average = sum / (float)score.length; // 계산결과를 float 타입으로 얻으려 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}
