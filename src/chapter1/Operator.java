package chapter1;

public class Operator {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
//		산술 연산자
		
//		더하기 : +
//		좌항에 우항을 더한 값을 반환
		int intresult = a + b;
		System.out.println(intresult);
		double doubleresult = c + d;
		System.out.println(doubleresult);
		System.out.println(a + c); // 정수형태 + 실수형태 = 실수형태
		
		//빼기 : -
		//좌항에서 우항을 뺀 값을 반환
		intresult = a -b ;
		System.out.println(intresult);
		doubleresult = c - d;
		System.out.println(doubleresult);
		System.out.println(a-d);
		
//		곱하기 : *
//		좌항에 우항을 곱한 값을 반환
		intresult = a * b;
		doubleresult = c * d;
		System.out.println(intresult);
		System.out.println(doubleresult);
		System.out.println(a * c);
		
//		나누기 : /
//		좌항에 우항을 나눈 값을 반환
//		정수와 정수를 나누면 실수부가 소멸함
		
		intresult = a / b;
		doubleresult = c / d;
		System.out.println(intresult);
		System.out.println(doubleresult);
		System.out.println(a / c);  
		
//		나머지 : %
//		좌항에 우항을 나눈 나머지를 반환
		intresult = a % b;
		doubleresult = c % d;
		
		System.out.println(intresult);
		System.out.println(doubleresult);
		System.out.println(a % d);
		
//		증감 연산자 : ++, --
//		피연산자의 값을 1증가 혹은 감소
//		피연산자가 반드시 변수이어야 함
//		증가 연산자 : ++
//		감소 연산자 : --
		
		int nul = 5;
		nul++;
		System.out.println(nul);
		nul--;
		System.out.println(nul);
		
		// nul = 5
		System.out.println(nul++);
		System.out.println(++nul);
		System.out.println(nul--);
		System.out.println(--nul);
		
//		대입 연산자 : 좌항에 우항을 할당
//		일반 대입 연산자 : =
//		좌항에다가 우항의 연산결과 값을 할당함
		int number = 10;
		number = 10 + 5;
		
//		복합 대입 연산자 : 타연산자=
//		+=, -=, *=, /=, %=
//		좌항에 좌항과 우항의 연산결과를 할당함
//		좌항은 반드시 초기화가 되어있어야 함 
//		좌항은 반드시 인반 변수가 와야함(상수 x)
		number += 3;
		System.out.println(number);
		
//		 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리 값으로 좌항에 할당함
		
		boolean booleanResult;
		
//		같다, 다르다 연산
//		== : 좌항이 우항과 같으면 true, 다르면 false
//		!= : 좌항이 우항과 같지 않으면 true, 같으면 false
		booleanResult = a == c;
		System.out.println(booleanResult);
		booleanResult = a != c;
		System.out.println(booleanResult);
		
		//
		

	}

}
