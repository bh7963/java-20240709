package chapter3;

public class Package1 {

	public static void main(String[] args) {
//		Wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 해주는 클래스
//		일반적으로 기본형 데이터타입의 풀네임을 사용하고 첫글자를 대문자로 지정
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "문자열";
		
//		자주 사용되는 기술
//		parse 메서드 : 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("123456789");
//		toString 메서드 : 특정한 타입의 값을 문자열로 변환
		String str = Integer.toString(2024);
		str = wrapperInt.toString();
		
//		Math 클래스 : 수학 연산과 관련된 다양한 메서드를 제공해주는 클래스
//		모든 메서드가 static인 정적 메서드
		
//		올림 메서드 : ceil()
		System.out.println(Math.ceil(3.14));
//		내림 메서드 : floor()
		System.out.println(Math.floor(3.14));
//		반올림 메서드 : round()
		System.out.println(Math.round(3.14));
		
//		특정 자리에서 올림, 내림, 반올림 
//		소숫점 자리
		System.out.println(Math.round(314.15)/100.0);
		
//		정수자리
		System.out.println(Math.round(98765/100.0) * 100);
		
//		거듭제곱 : pow()
		System.out.println(Math.pow(11, 4));
	}

}
