package ch05;


public class Kang1103 {
	public static void main(String args[]) {
		int[] kangLotto = new int[6];
		String ball = "";
		
		for( int i = 0; i < kangLotto.length; i++) {
			kangLotto[i] = (int)(Math.random() * 45);
		
		}
		for ( int i = 0; i < kangLotto.length; i++ ) {
			if ( i == kangLotto.length - 1 ) {
				ball += i;
			} else { 
				ball += i + ", ";
				}
		}
	System.out.print(ball);
	}
}
