package chapter2;

// 기타 제어자(비접근 제어자) : 접근 제어와 무고나하게 동작을 제어하는 것

// final 제어자
// - 클래스 : final 제어자가 붙은 클래스는 확장할 수 없음
final class FinalClass{
	int number;
}

// class SubFinalClass extends FinalClass{}
// - 메서드 : final 제어자가 붙은 메서드는 재정의(오버라이드)할 수 없음
class FinalMethodClass {
	final void finalMethod() {
		
	}
}
class subFinalMethodClass extends FinalMethodClass{
	
//	@Override
//	void finalMethod() {
//		
//	}
}
// - 변수 : final 제어자가 붙은 변수는 재할당 할 수 가 없음
class FinalVariableClass {
	final int number = 10;
	
	void method() {
//		number = 20;
	}	
}

// static 제어자
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능
class StaticClass {
	static int number;
	static void method() {};
}

//제어자의 조합
class ModifierCombination{
//	public + static + final의 변수, 메서드
	public static final int NUMBER = 10;
	
//	변수에서 private + final (필드에서 final은 생성자에서 필수로 초기화 해야함을 의미)
	private final String name;
	ModifierCombination (){
		name = "홍길동";
	}
// 메서드에서 private + final(final의 의미가 없음)
	private final void method() {};
	
//	메서드에서 private + abstract (서로 상반되는 의미로 사용 x)
// 클래스와 메서드에서 final + abstract x
	
}

abstract class SuperClass1{	
	
//	private abstract void method();
//	public abstract final void method();
}

public class Modifier {

	public static void main(String[] args) {
		
		StaticClass.number = 10;
		StaticClass.method();

	}

}
