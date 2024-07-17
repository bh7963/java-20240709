// 상속 : 객체지향 프로그래밍 특성 중 하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 코드의 중복을 제거하고 확장성을 높일 수 있음
// extends 키워드를 사용하여 확장

// class SubClass extends SuperClass {....}
package chapter2;


import java.util.Arrays;

// final로 선언된 클래스는 상속하여 확장할 수 없음
/*final*/ class Human{
	
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	/*final*/ void sayHello() {
		System.out.println(name + "(이)가 인사를 합니다.");
	}
	
}

// Developer는 휴먼을 확장하고 있다. 
// java에서는 단일 상속만 지원함
// 다중 상속에서 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기위함
// 다중 상속과 동일한 효과를 보기위해서 인터페이스 혹은 중첩 상속을 수행함
class Developer extends Human /*, Korean1 */{

	String[] skills;
	
	Developer (String name, int age, String[] skills){
//		super : 부모 클래스를 지칭하는 키워드
//		super()는 부모클래스의 생성자를 가르킴
		super(name, age);
		this.skills = skills;
	}
	

	void develop() {
		System.out.println(name + "(이)가 " + Arrays.toString(skills)+ "로 개발을 합니다.");
	}
}

class SalesMan extends Human { 

	int sales;
	
	SalesMan (String name, int age, int sales){
		super(name, age);
		this.sales = sales;
//		부모 생성자 호출(super())은 반드시 현재 생성자의 첫번째 구문으로 작성해야함
//		super(name);
				
	}
	
//	오버라이딩 : 하위클래스에서 상위 클래스의 메서드를 재정의하는 것
//	=규칙=
//	1. 상위클래스에서 선언된 메서드 이름, 매개변수의 조합이 같아야함
//	2. 상위클래스에서 선언된 메서드가 final로 선언됬을 경우 재정의 불가
	
//	@Override : 컴파일러에게 현재 작업이 오버라이딩 작업임을 알려줌
//	final로 선언된 메서드는 오버라이딩 할 수 없음
	@Override
	void sayHello() {
		System.out.println(name + "(이)가 인사를 합니다.");
	}
//	아래 작업은 오버라이딩이 아니라 오버로딩임
	void sayHello(String company) {
		System.out.println(name + "이 " +company+ "에서 자신을 소개합니다.");
	}

	void sale() {
		System.out.println(name + "(이)가 " + sales +"%만큼의 매출을 올렸습니다");
	}
}

class Korean1 {
	String address;
	
	void sayHello() {
		System.out.println("안녕하세요");
}
}

public class Inheritance{

	public static void main(String[] args) {
		
		Developer developer1 = new Developer("홍길동", 20, new String[] {"java", "python"} );
		SalesMan salesman1 = new SalesMan("김영희", 25, 300000);
		
		System.out.println(developer1.name);
		System.out.println(developer1.age);
		System.out.println(Arrays.toString(developer1.skills));
		developer1.sayHello();
		developer1.develop();
		System.out.println("-------------------------");
		System.out.println(salesman1.name);
		System.out.println(salesman1.age);
		System.out.println(salesman1.sales);
		salesman1.sayHello();
		salesman1.sale();
		
//		모든 클래스는 'Object'라고하는 클래스를 최상위 클래스로 반드시 상속받고 있음
		salesman1.equals("");// Object 클래스에 존재하는 메서드
		

	}

}
