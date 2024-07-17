package chapter1;

public class Subject1 {

	public static void main(String[] args) {
		// 변수 (variable)
					// 데이터를 메모리에 저장하는데 사용하는 기본 요소
					// 변수를 생성(선언)할 때는 반드시 해당 변수가 어떤 형태의 데이터를 가질 수 있는지 지정해야함
					
					// 선언(생성) 방법
					// 데이터타입 변수명;
					int number1;	// 정수를 담을 수 있는 number1이라는 이름을 가지는 메모리 공간을 생성
					
					// 초기화(초기값을 넣는) 방법
					// 변수 = 데이터;
					number1 = 9;	// number1이라는 메모리 공간에 9라는 데이터를 초기값으로 넣음
					
					// 선언과 동시에 초기화 방법
					// 데이터타입 변수명 = 데이터;
					int number2 = 37;	// 정수를 담을 수 있는 number2 라는 이름을 가지는 메모리 공간을 생성하고 그 공간에 초기값 37을 넣음

					System.out.println(number1);
					System.out.println(number2);
					
					// 변수는 선언 후 반드시 초기화 이후에 사용할 수 있음
					// int number3;
					// System.out.println(number3);
					
					// 변수에 지정된 타입의 데이터가 아니면 할당이 불가능
					// int number3 = 3.14;
					
					number1 = 12;	// 처음 변수에 값을 할당하는 행위가 아니기 때문에 해당 코드는 초기화가 아님
					System.out.println(number1);
					
					// 변수 명명 규칙
					// 1. 중복된 변수명을 사용할 수 없음
					int number;
					// int number;
					// 변수의 데이터 타입이 다르더라도 같은 변수명을 사용할 수 없음
					// double number;
					
					// 2. 연산자로 사용되는 특수문자는 포함할 수 없음
					// boolean flag+;
					
					// 3. 변수명은 숫자로 시작할 수 없음
					// int 1number;
					
					// 4. 키워드로만 이루어져있는 단어는 사용할 수 없음
					int int1;
					// int int;
					
					// 비문법상 규칙 (암묵적 룰)
					// 1. 띄워쓰기 규칙
					// web site address
					// - Camel Case : 띄워쓰기를 표현할 때 띄워쓰기를 제거하고 바로 뒤 문자를 대문자로 표현
					String webSiteAddress;
					// - Snake Case : 띄워쓰기를 표현할 때 띄워쓰기 자리에 _로 표현
					String web_site_address;
//				 - Upper : 대문자 표시
//				 - Lowwer : 소문자 표시
				
//				 UpperCamelCase : 클래스, 인터페이스 (첫문자를 대문자로 시작)
//				 lowerCamelCase : 변수, 함수, 메서드 (첫문자를 소문자로 시작)
//				 UPPER_SANKE_CASE : 상수형(변경 불가형) 변수
//				 lower_snake_case : 변수, 함수, 메서드(모든 문자를 소문자로 작성)
				
				// 상수 (CONSTANT)
				// 초기화가 이루어지면 변경이 불가능한 변수
				// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
				// final 데이터타입 변수명(상수명);
				final int MAX;
				MAX = 100;
				// MAX = 2;  상수는 초기화 이후 재할당 X
				// 상수 선언과 동시에 초기화
				final int MIN = 100;
				
				double size1 = 146.6 * 70.6;
				// 리터럴에 이름을 부여하기 위한 용도로 상수를 많이 사용
				final double IPHONE_15_PRO_HEIGHT = 146.6;
				final double IPHONE_15_PRO_WIDTH = 70.6;
				
				double size2 = IPHONE_15_PRO_HEIGHT * IPHONE_15_PRO_WIDTH;
				
				final int HEIGHT = 10;
				int sum =  HEIGHT + 20;
				int multi = HEIGHT * 20;
				
				// 리터럴 상수 : 값 그자체 (코드 상에서) 

				// int age = 32; 이라는 구문에서 '32'가 리터럴에 해당함
				
//				문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입 
				
//				char : 2byte = 16bit의 크기를 가지는 문자형 데이터 타입
//				0 ~ 65,535 
//				문자를 리터럴로 표현할 때 ''로 묶어서 표현
				char char1 = 'a';
				char char2 = 97;
				System.out.println(char1);
				System.out.println(char2);
				
//				논리형 데이터 타입: 참과 거짓 값을 가지는 데이터 타입
//				boolean : 1byte = 8bit의 크기를 가지는 논리형 데이터 타입
//				true, false 
				
				boolean bool1 = true;
				boolean bool2 = false;
				
				System.out.println(bool1);
				System.out.println(bool2);
				
//				형 변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것

//				자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
				
//				강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생

				int num = 300;
				long ln = num;
				System.out.println(ln);
				int num2 = (int)ln; // 강제 형변환
				System.out.println(num2);
				
				char chr = 100;
				short srt = (short)chr; // 숫자 타입에서 문자 타입으로의 형변환은 무조건 강제 형변화가 필요
				
				
				int num3 = chr;

//				배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
//				new 연산자를 이용해서 생성을 해야함
//				한번 생성된 배열의 크기는 변경할 수 없음
				
//				배열변수 선언
//				데이터타입[] 배열 변수명;
//				배열생성
//				new 데이터타입[배열의길이]; 
				int[] list1;
				list1 = new int[5];
				
				int[] list2 = {1,2,3,4,5};
				int[] list3 = new int[] {1,2,3,4,5};
				System.out.println(list1);
				System.out.println(list2);
				System.out.println(list3);
				
//				 배열의 요소에 접근할 때는 '인덱스'사용
//				인덱스 0번부터 시작, 마지막 인덱스는 길이의 -1번
				int item = list2[2];
				System.out.println(item);
				list2[0] = 9;
				item = list2[0];
				System.out.println(item);
				
//				인덱스 범위를 초과하는 인덱스에 접근할 시 예외발생
//				System.out.println(list2[99]);
				
//				배열의 길이를 확인하고자 할땐 .length를 사용 
//				배열이름.length
				System.out.println(list2.length);
				
				
				int[] example1 = new int[] {1,2,3};
				int[] example2 = example1;
				System.out.println(example1[1]);
				System.out.println(example2[1]);
				
				example1[1] = 99;
				System.out.println(example1[1]);
				System.out.println(example2[1]);
				
				char[] chr1 = {'a', 'p', 'p', 'l', 'e'};
				System.out.println(chr1);
				
//				String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
//				선언
//				String 변수명;
//				생성
//				new String();
//				생성 후 초기화
//				String 변수명 = new String("문자열");
				String str1 = new String("apple");
				System.out.println(str1);
				String statement = new String("My name is Loki   ");
				
//				1. 문자열 결함
//				+ 혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
				System.out.println(str1 + "@@@");
				System.out.println(str1.concat("@@@"));
				
//				2. 문자열 비교
//				equals(문자열): 두 분자열이 동등하진 비교
//				compareTo(문자열) : 두 문자열을 사전순으로 비교(대소문자로 비교)
//				compareToIgnoreCase(문자열) : 두 문자열을 사전순으로 비교(대소문자로 구분 x)
				System.out.println(statement.equals("My name is Loki   "));
				System.out.println(statement.compareTo("My name is Loki   "));
				
				
//				3. 문자열 길이 확인
//				length(문자열): 문자열의 길이를 반환
				System.out.println(statement.length());
				
//				4. 문자열 변환
//				toUpperCase() : 모든 문자를 대문자로 변경
//				toLowerCase() : 모든 문자를 소문자로 변경
//				trim() : 문자열의 앞뒤 공백을 제거
				System.out.println(statement.toUpperCase());
				System.out.println(statement.toLowerCase());
				System.out.println(statement.trim());
				
//				5. 문자열 찾기
//				indexOf(문자열) : 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
//				lastIndexOf(문자열) : 찾고자하는 마지막 찾은 위치의 인덱스 번호를 반환
//				indexOf 와 lastIndexOf 둘다 존재하지 않은 문자열을 찾을 경우 -1을 반환
				statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 니가 그린 기린 그림은 잘못 그린 기린 그림이다";
				System.out.println(statement.indexOf("기린"));
				System.out.println(statement.lastIndexOf("기린"));
				System.out.println(statement.indexOf("사자"));
				
//				6. 부분 문자열
//				substring(시작인덱스, 종료인덱스): 문자열을 원하는 크기만큼 추출  
				System.out.println(statement.substring(26));
				System.out.println(statement.substring(26, 31));
				
//				참조형 데이터 타입
//				주소를 가지고 있는 변수의 데이터 타입
//				null을 가질 수 있음(null:  아무것도 지정되지 않은 상태)
//				배열 ,클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속함
				String str2 = null;
				System.out.println(str2.trim());
				
			}

}
