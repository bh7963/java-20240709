package practice;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		// 문자열 결합
		// 사용자로부터 기준 문자열, 연결할 문자열을 두개 입력받음
		// 입력받은 문자열을 문자 배열로 변경하고 두 문자 배열을 연결
		// 새로운 문자 배열에 저장 후 출력
		String user;
		Scanner scan = new Scanner(System.in);
		String[] firstStr = new String[0];
		String[] secondStr = new String[0];
		char[] firstChr = new char[firstStr.length];
		char[] secondChr = new char[secondStr.length];
		
		user = scan.nextLine();
		
		for (int i = 0; i < firstStr.length; i++) {
			firstChr[i] = user.charAt(i);
		}
		 
		
		
		
	}

}
