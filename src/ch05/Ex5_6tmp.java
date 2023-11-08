package ch05;

import java.util.Arrays;
public class Ex5_6tmp {
	public static void main(String[] args) {
		//					 01234
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1,4); // to를 생략하면 끝까지 나옴
		String str3 = str.substring(1); // 아래와 같다
		String str4 = str.substring(1, str.length());
		System.out.println(ch);
		System.out.println(str2); //BCD
		System.out.println(str3);
		System.out.println(str4);
		
	}
}
