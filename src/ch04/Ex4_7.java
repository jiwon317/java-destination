package ch04;

public class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;
		
		// {}안의 내용을 20번 반복한다.
		// Quiz. 1~10 사이의 난수를 20개 출력하시오.
		for (int i = 1; i <= 20; i++) {
			num = (int) (Math.random() * 10); // 0<=x<10
			System.out.println(num);
		}		
	}
}
