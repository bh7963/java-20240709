package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문자열 자르기
		// 사용자로부터 시작 인덱스와 
		// 종료 인덱스를 입력받고
		// 입력받은 시작인덱스와 종료인덱스 까지 
		// 문자열을 잘라서 자른 문자 배열을 출력 
		
		// String 기능인 subString을 사용하지 않고 char[]을 이용해서 작성
		String str = new String("내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.");
		int startIdx;
		int endIdx;
		
		
		//char[] resultChr = new char[0];
		
		System.out.println("시작할 인덱스를 입력: ");
		startIdx = scan.nextInt();
		System.out.println("마지막 인덱스를 입력: ");
		endIdx = scan.nextInt();
		
		char[] strChar= str.toCharArray();
		char[] resultChar = new char[endIdx - startIdx];
		
		for (int i = 0; i < resultChar.length; i++) {
			
			resultChar[i] = strChar[startIdx+i];
			
		}
		System.out.println(resultChar);
		
		
		}
		
		
		
		

	}


