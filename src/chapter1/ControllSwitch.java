package chapter1;
import java.util.Scanner;

public class ControllSwitch {

	public static void main(String[] args) {
		
		
		// switch 문 : 특정 변수 또는 표현식에 따라 실행 할 코드 블럭의 범위를 결정하는 것
		
//		switch (변수 - 일반 표현식) {
//		
//		case 값1: 
//			변수 - 일반 표현식이 값 1 과 같을때 시작할 코드 블럭 위치
//			switch내부에서 break문을 만나면 탈출하는 코드 블럭
//		case 값2: 
//			변수 - 일반 표현식이 값 2 과 같을때 시작할 코드 블럭 위치
//			switch내부에서 break문을 만나면 탈출하는 코드 블럭
//			
//		default:
//			변수 - 일반 표현식이 case의 값과 일치하는 것이 없거나
//			바로 위에서 break문을 만나지 않으면 실행되는 코드	
//		}

//		number가 0이면 A,B,C출력 
//		1 - B, C / 2 - C, 3 - D,E,F / 4 - E,F / 1 ~ 4 != F
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		switch (number){
		
		case 0:
			System.out.println("A");
			System.out.println("B");
			System.out.println("C");
			break;
		case 1:
			System.out.println("B");
			System.out.println("C");
			break;
			
		case 2:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
			System.out.println("E");
			System.out.println("F");
			break;
		case 4:
			System.out.println("E");
			System.out.println("F");
			break;
		default:
			System.out.println("F");
		
		
		}
		scan.close();
		
		String[] fruits = {"apple", "banana", "cacao"};
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] += "  add";
//			System.out.println(fruits[i]);
		}
		
//		foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문
//		컬렉션 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음
		
		for (String fruit : fruits ) {
			System.out.println(fruit);
		}
		
		for (String fruit : fruits) {
			fruit += "  add";
//			System.out.println(fruit);
		}
		
		for (String fruit : fruits ) {
			System.out.println(fruit);
		}
		
	}

}
