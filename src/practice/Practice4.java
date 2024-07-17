package practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		//모두 대문자로 만들기
		// 사용자로부터 문자열 statement입력받고 
		// 입력 받은 문자열을ㅇ 영어라면 모두 대문자로 변경하여
		// 문자배열에 저장한 후 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 ");
		String str = scan.nextLine();
		
		char[] strChar = str.toCharArray();
		
		for (int i = 0; i < strChar.length; i++) {
			
			char chr = strChar[i];
			boolean lowerEnglish = chr >= 97 && chr <= 122;
			if (!lowerEnglish) continue;
			
			strChar[i] = (char)(chr-32);
			
			}
		System.out.println(strChar);
			
		}
		
		
		

	}


