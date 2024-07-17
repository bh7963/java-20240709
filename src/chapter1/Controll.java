package chapter1;
import java.util.Scanner;

public class Controll {

	public static void main(String[] args) {
		
		// 코드 블럭
		// 코드들의 묶음 (하나의 기능으로 취급)
		// {}로 표시
		
		{
			// 더하기 연산
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result);
		}
		
		{
			// 빼기 연산
			int a = 10;
			int b = 5;
			int result = a - b;
			System.out.println(result);
			
		}
		
		// 제어문 : 조건에 따라서 코드의 흐름을 경정하는 것
		
		// 조건문 : 특정 조건이 만족하면 해당 코드 블럭을 실행하는 것
		
		// if문 : 주어진 조건이 true 이면 코드를 실행하게 하는것
		// if (조건-논리표현식) {true면 실행할 코드}
		
		//else문 : if문의 조건-논리표현식이 false이면 코드를 실행하게 하는것
		// if(조건-논리표현식){true면 실행할 코드 블럭}else{false면 실행할 코드 블럭}
		// else문은 반드시 if문 이후에 와야함(단독 사용 x)
		// else문에는 조건 필요 x
		
		
		// 점수가 60점 이상이면 "통과" 라는 문자열 출력 아닐경우 아무것도 출력안함
		//Scanner scan = new Scanner(System.in);
		
		int score;
//		System.out.println("점수 입력");
//		score = scan.nextInt();
//		
//		if (score >= 70) {
//			System.out.println("통과");
//		}else {
//			System.out.println("불통");
//		}
//		scan.close();
//		
		
		// 점수가 60점 이상이면 통과 그렇지 않으면 과락 이라는 문자열을 출력하는 조건문 작성
//		System.out.println("if - else 문 코드 실행");
//		score = 70;
//		if (score >= 60) System.out.println("통과");
//		else {System.out.println("과락");}
//		System.out.println("if - else 문 코드 종료");
//		
		//나이가 30살 이상 이면서 성별이 남자이면 "30대 중년남성입니다"를 출력
//		int age;
//		String gender;
//		
//		age = 35;
//		gender = "남자";
//		boolean isMiddleMan = age >= 30 && gender.equals("남자");
//		
//		if (isMiddleMan) {
//			
//			System.out.println("30대 중년 남성입니다");
//			
//		}else {
//			
//			System.out.println("일반입니다.");
//		}
		
		// 점수가 90점 이상이면 'A'출력
		// 점수가 80점 이상이면 'B'출력
		// 점수가 70점 이상이면 'C'출력
		// 점수가 60점 이상이면 'D'출력
		// 점수가 60점 미만이면 'F'출력
		
		score = 80;
		
		if (score >= 90) System.out.println("A");
		else if (score >= 80 )System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else System.out.println("F");
			
		
		
	

	}

}
