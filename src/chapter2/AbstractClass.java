package chapter2;

import java.util.Arrays;

/****
 추상 클래스 : 추상 메서드를 포함할 수 있는 크랠스
 추상 클래스 자체로 인스턴스를 생설할 수 없음, 반드시 추상클래스를 확장한 하위 클래스로 인스턴스를 생성해야 함
 abstract class 추상클래스명 {}

 추상 메서드 : 선언부만 존재하고 구현부는 존재하지 않은 메서드
 반드시 추상 클래스 내부에서만 선언할 수 있음
 반드시 추상클래스를 확장한 하위클래스에서 재정의(오버라이딩) 하여 구현해야함
 abstract 반환타입 추상메서드명 (매개변수);
**/

abstract class Human3 {
	String name;
	int age;
	
	void sleep() {
		System.out.println("수면 중.....");
	}
	abstract void greet();
//	{
//		System.out.println("저는 " + name + "이고 " + age + "세 입니다.");
//	}
}

class Developer2 extends Human3{
	String[] skills;
	
	void develop2() {
		System.out.println(name + "이 " + Arrays.toString(skills) + "로 개발을 합니다." );
	}
	@Override
	void greet() {
		System.out.println("저는 " + name + "이고 "+age + "세 이면서 개발자 입니다.");
	}
}
class SalesMan2 extends Human3{
	int sales;
	
	void sale2() {
		System.out.println(name + "이 "+ sales + " 만큼 매출을 올렸습니다.");
	}
	@Override
	void greet() {
		System.out.println("저는 " + name + "이고 "+age + "세 이면서 영업사원 입니다.");
	}
}

class Police extends Human3{
	
	@Override
	void greet() {
		System.out.println("저는 " + name + "이고 " + age + "세 이면서 경찰입니다." );
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Developer2 developer = new Developer2();
		developer.name = "홍길동";
		developer.age = 20;
		developer.greet();
		
		SalesMan2 salesman = new SalesMan2();
		salesman.name = "김영희";
		salesman.age = 22;
		salesman.greet();
		
		Police police = new Police();
		police.name = "고길동";
		police.age = 40;
		police.greet();

	}

}
