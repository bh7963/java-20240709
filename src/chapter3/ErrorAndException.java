package chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

/***
 에러 : 주로 프로그램에서 복구 할 수 없는 심각한 문제
 자원 부족이 큰 원인을 차지함
 - 컴파일 에러 : 소스코드의 문법을 준수하지 않을 때 발생
 1. 문법 오류 : 괄호, 세미클론 등의 잘못된 사용
 2. 타입 불일치 : 변수의 타입이나 메서드의 반환티입이 일치하지 않을 때
 3.미선언 변수 사용 : 선언되지 않은 변수 혹은 메서드를 사용할 때(대부분 오타로 인해 발생) 
 
 - 런타임 에러 : 프로그램 실행중에 발생
 1. 리소스의 부족
 2. 외부 서비스와의 미연결
 3. 라이브러리의 버전 불일치

 예외 : 프로그램 정상 실행 중에 발생할 수 있는 예상치 못한 상황
 에러는 발생시 프로그램 실행 자체가 안되지만 예외는 실행은 정상적으로 됨
 개발자가 직접 처리 및 예방할 수 있음
 
 ***/
public class ErrorAndException {
	
//	 throw 키워드로 메서드의 호출부에 예외처리에 대한 강제성을 부여
	private static void throwException() throws Exception {
//		throw 키워드로 강제로 예외를 발생
//		throw new ExceptionClass("메세지");
		throw new NullPointerException("오류발생");
	}

	public static void main(String[] args)throws Exception {
		
		Scanner scan = new Scanner(System.in);
		/***
		예외처리 방법
		try - catch 구문 사용하여 처리 가능
		try {예외 발생 가능성이 있는 구문}
		catch(예외클래스 ,변수){특저 예외가 발생할 때 실행할 구문}

		 발생할 수 있는 예외 
		 - 사용자가 정수를 입력했을 때(InputMismatchException)
		 - 사용자가 0을 입력했을 때 (ArithmeticException)
		***/
		
	try {
		int num = scan.nextInt();
		int result = 10 / num;
		System.out.println("결과 " + result);
	}catch (InputMismatchException e) {
		System.out.println("정수 만 입력해 주세요");
	}catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다");
	}catch(Exception e) {
		System.out.println("예외가 발생했습니다.");
	}
	
	finally {
//		finally 키워드로 예외 발생 유무와 관계없이 실행할 코드를 작성
//		대부분 자원의 반환처리 및 연결 종료 처리작업을 수행함
		scan.close();
		System.out.println("Scanner 자원을 반환했습니다.");
	}
		
		try {
			
		}catch (Exception e){
			throwException();	
		}
	
	System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
