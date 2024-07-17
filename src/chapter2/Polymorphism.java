package chapter2;
/***
 - 다형성 : 하나의 표현으로 여러가지 형태를 나타낼 수 있는 것
 - 오버로딩 : 같은 클래스 내부에서 동일한 이름의 메서드를 여러개 정의할 수 있도록 하는 것
 - 오버로드 : 자식 클래스에서 부모 클래스에 정의된 메서드를 재정의 하는것

 - 업 캐스팅(Up-Casting) : 하위 클래스의 객체를 상위 클래스 혹은 구현된 인터페이스 타입의 변수에 담을 수 있도록 하는 것
 - 다운 캐스팅(Down-Casting) : '업 캐스팅'된 객체를 다시 원래 타입의 변수에 담을 수 있도록 하는 것

// 다형성의 장점
- 코드재사용 : 상송과 인터페이스를 통해 코드를 재사용하고 중복을 줄일 수 있음
- 유연성 : 다형성을 이용하면, 코드 변경없이 캑체의 동작을 변경할 수 있음
- 확장성 : 새로운 클래스 추가나 기존 클래스 변경이 용이
***/
class Human6{
	String name;
	int age;
	
	// Human3 생성자
	Human6(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}
// Human3가 수행할 동작 메서드 
interface FootballPlay{
	void kick();
	void foul();
}

class FootballPlayer extends Human6 implements FootballPlay{
	String team;
	
	FootballPlayer(String name, int age, String team){
		super(name, age);
		this.team = team;
	}

	@Override
	public void kick() {
		System.out.println(name + "가 " + "킥을 합니다");
	}

	@Override
	public void foul() {
		System.out.println(name + "가 " + "파울을 했습니다");
	}
	
}



public class Polymorphism {

	public static void main(String[] args) {
		 
		Human6 human = new Human6("홍길동",20);
		
		FootballPlayer footballPlayer = new FootballPlayer("이성계", 22, "대한민국");
		
		Human6 human2 = footballPlayer;
		System.out.println(human2.name);
		System.out.println(human2.age);
//		human2.kick();
		
//		업 캐스팅
		FootballPlay footballplay = footballPlayer;
//		footballplay.kick();
//		footballplay.foul();
		
//		System.out.println(footballplay.name);
//		System.out.println(footballplay.age);

		FootballPlayer footballPlayer2 = (FootballPlayer)human2;
//		System.out.println(footballPlayer2.name);
//		System.out.println(footballPlayer2.age);
//		System.out.println(footballPlayer2.team);
//		footballPlayer2.kick();
//		footballPlayer2.foul();
		
		FootballPlayer footballPlayer3 = (FootballPlayer)footballplay;
//		System.out.println(footballPlayer3.name);
//		System.out.println(footballPlayer3.age);
//		System.out.println(footballPlayer3.team);
//		footballPlayer3.kick();
//		footballPlayer3.foul();
		
		FootballPlayer footballPlayer4 = (FootballPlayer)human;
		System.out.println(footballPlayer4.name);
		System.out.println(footballPlayer4.age);
		
//		human인스턴스에 FootballPlayer라는 생성자를 다운캐스팅했지만 human인스턴스에 team, kick(), foul()에 해당하는 코드들이 없어 수행 불가(문법적으로는 맞다. 단, 실행 과정에서 오류발생) 
//		System.out.println(footballPlayer4.team);
//		footballPlayer4.kick();
//		footballPlayer4.foul();
		
		
		Object obj1 = human;
		Object obj2 = footballPlayer;
		Object obj3 = 3;
		
	}
	
	void method(Object obj) {
	
//		매개변수나 반환타입으로 Object 타입을 지정하게 되면 해당 인스턴스 사용시
//		문자(강제 다운캐스팅 타입 불일치)가 발생할 수 있음
//		사용을 지양해야함
//		obj;
	}

}
