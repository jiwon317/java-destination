package ch04;

public class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;
		
		// {}안의 내용을 20번 반복한다.
		// Quiz. 1~10 사이의 난수를 20개 출력하시오.
		// Quiz2. -5~5사이의 난수 20개출력
		// -5-4-3-2-1012345 11개
		for (int i = 1; i <= 20; i++) {
			num = (int) (Math.random() * 11) -5; // 0<=x<10
			System.out.println(num);
		}		
	}
}
